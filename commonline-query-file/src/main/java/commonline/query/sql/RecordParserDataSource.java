/**
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package commonline.query.sql;

import flapjack.parser.RecordParser;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


public class RecordParserDataSource implements DataSource, InitializingBean {
    private static final RecordLayoutSqlTableFactory sqlTableFactory = new RecordLayoutSqlTableFactory();
    private DriverManagerDataSource delegate;
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private Map<String, RecordParser> parsers = new HashMap<String, RecordParser>();

    public Connection getConnection() throws SQLException {
        return delegate.getConnection();
    }

    public Connection getConnection(String username, String password) throws SQLException {
        return delegate.getConnection(username, password);
    }

    public PrintWriter getLogWriter() throws SQLException {
        return delegate.getLogWriter();
    }

    public void setLogWriter(PrintWriter printWriter) throws SQLException {
        delegate.setLogWriter(printWriter);
    }

    public void setLoginTimeout(int i) throws SQLException {
        delegate.setLoginTimeout(i);
    }

    public int getLoginTimeout() throws SQLException {
        return delegate.getLoginTimeout();
    }

    public <T> T unwrap(Class<T> tClass) throws SQLException {
        return (T) delegate.unwrap(tClass);
    }

    public boolean isWrapperFor(Class<?> aClass) throws SQLException {
        return delegate.isWrapperFor(aClass);
    }

    public void afterPropertiesSet() throws Exception {
        delegate = createDelegate();
        delegate.setUrl(url);
        delegate.setPassword(password);
        delegate.setUsername(username);
        delegate.setDriverClassName(driverClassName);
        JdbcTemplate template = new JdbcTemplate(delegate);
    }

    protected DriverManagerDataSource createDelegate() {
        return new DriverManagerDataSource();
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
