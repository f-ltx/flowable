import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngineConfiguration;

/**
 * @author Administrator
 */
public class HolidayRequest {

    public static void main(String[] args) {
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
        configuration.setJdbcDriver("com.mysql.jdbc.Driver");
        configuration.setJdbcUrl("jdbc:mysql://localhost:3306/flowable?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&useSSL=false&serverTimezone=GMT%2B8");
        configuration.setJdbcUsername("root");
        configuration.setJdbcPassword("mysqladmin");
        configuration.setDatabaseSchemaUpdate("true");
        ProcessEngine processEngine = configuration.buildProcessEngine();
    }

}