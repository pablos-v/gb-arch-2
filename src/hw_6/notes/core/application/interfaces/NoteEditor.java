package hw_6.notes.core.application.interfaces;

import hw_6.notes.core.domain.Note;

public interface NoteEditor extends Editor<Note, Integer> {

    void printAll();
}
