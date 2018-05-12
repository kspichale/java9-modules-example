import com.example.mysql.MySqlDatabaseDriver;

module module.mysql {
    requires module.api;
    provides com.example.api.DatabaseDriver with MySqlDatabaseDriver;
}