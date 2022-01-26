 package in.notesproject.spingboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.notesproject.spingboot.entity.Note;

@Repository
public interface NotesRepository extends JpaRepository<Note, Long> {

}
