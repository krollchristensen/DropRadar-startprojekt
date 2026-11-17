package dk.zealand.dropradar.repository;
import dk.zealand.dropradar.model.Drop;
import dk.zealand.dropradar.database.DatabaseConnection;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DropRepository {
    public List<Drop> findFrom(LocalDate date) throws SQLException {
        String sql = """
                SELECT id, name, category, release_date FROM drops
                WHERE release_date >= ? ORDER BY release_date, id
                """;
        List<Drop> dropList = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setObject(1, date);
            try (ResultSet rows = statement.executeQuery()) {
                while (rows.next()) {
                    dropList.add(new Drop(rows.getInt("id"), rows.getString("name"),
                            rows.getString("category"), rows.getObject("release_date", LocalDate.class)));
                }
            }
        }
        return dropList;
    }

    public void insert(Drop drop) throws SQLException {
        // TODO: Udfyld insert med hjælp fra README.
        throw new UnsupportedOperationException("Dette menupunkt er en del af opgaven.");
    }

    public boolean updateDate(int id, LocalDate date) throws SQLException {
        // TODO: Udfyld updateDate med hjælp fra README.
        throw new UnsupportedOperationException("Dette menupunkt er en del af opgaven.");
    }

    public boolean deleteById(int id) throws SQLException {
        // TODO: Udfyld deleteById med hjælp fra README.
        throw new UnsupportedOperationException("Dette menupunkt er en del af opgaven.");
    }
}

