package dk.zealand.dropradar.model;

import java.time.LocalDate;

// MySQL tildeler id, når rækken indsættes.
public record Drop(Integer id, String name, String category, LocalDate date) {
    public Drop(String name, String category, LocalDate date) {
        this(null, name, category, date);
    }
}

