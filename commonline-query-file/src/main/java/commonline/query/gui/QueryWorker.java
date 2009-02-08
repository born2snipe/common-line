package commonline.query.gui;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class QueryWorker extends SwingWorker<Void, Void> {
    private String sql;
    private Connection connection;

    public QueryWorker(String sql, Connection connection) {
        this.sql = sql;
        this.connection = connection;
    }

    protected Void doInBackground() throws Exception {
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery(sql);
        QueryHandlerManager.instance().handle(resultSet);
        return null;
    }
}
