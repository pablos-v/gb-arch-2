package hw_6.notes.infrastructure.persistance;

import hw_6.database.NotesDatabase;
import hw_6.database.NotesRecord;
import hw_6.notes.core.application.interfaces.NotesDatabaseContext;
import hw_6.notes.core.domain.Note;
import hw_6.notes.infrastructure.persistance.configurations.NoteConfiguration;

import java.util.ArrayList;
import java.util.Collection;

public class NotesDbContext extends DbContext implements NotesDatabaseContext {

    private Collection<Note> notesList;

    @Override
    public Collection<Note> getAll() {
        if (this.notesList == null) {
            this.notesList = creator();
        }
        return this.notesList;
    }

    public NotesDbContext(Database database) {
        super(database);
    }

    private Collection<Note> creator() {
        Collection<Note> notesList = new ArrayList<>();
        //TODO: Этого кастинга быть не должно, тут должен работать внутренний механизм фреймворка
        for (NotesRecord record : ((NotesDatabase) database).getNotesTable().getRecords()) {
            notesList.add(new Note(
                    record.getId(),
                    record.getUserId(),
                    record.getTitle(),
                    record.getDetails(),
                    record.getCreationDate()
            ));
        }
        return notesList;
    }

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }


}
