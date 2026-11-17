package dk.zealand.dropradar.service;
import dk.zealand.dropradar.model.Drop;
import dk.zealand.dropradar.repository.DropRepository;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class DropService {
    private final DropRepository repository;

    public DropService(DropRepository repository) {
        this.repository = repository;
    }

    public List<Drop> findUpcoming() throws SQLException {
        return repository.findFrom(LocalDate.now());
    }

    public void add(String name, String category, LocalDate date) throws SQLException {
        // TODO: Udfyld add med hjælp fra README.
        throw new UnsupportedOperationException("Dette menupunkt er en del af opgaven.");
    }

    public boolean changeDate(int id, LocalDate date) throws SQLException {
        // TODO: Udfyld changeDate med hjælp fra README.
        throw new UnsupportedOperationException("Dette menupunkt er en del af opgaven.");
    }

    public boolean delete(int id) throws SQLException {
        // TODO: Udfyld delete med hjælp fra README.
        throw new UnsupportedOperationException("Dette menupunkt er en del af opgaven.");
    }

    private void validateDate(LocalDate date) {
        if (date.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Datoen skal være i dag eller senere.");
        }
    }

    private void validateId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Id skal være positivt.");
        }
    }
}

