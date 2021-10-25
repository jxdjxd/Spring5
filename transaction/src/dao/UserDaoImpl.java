package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author jxd
 * @date 2021/10/25 19:33
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * mary的钱多100
     */
    @Override
    public void addMoney() {
        String sql = "update user_db set money=money+? where username=?";
        jdbcTemplate.update(sql, 100, "mary");
    }

    /**
     * lucy的钱少100
     */
    @Override
    public void reduceMoney() {
        String sql = "update user_db set money=money-? where username=?";
        jdbcTemplate.update(sql, 100, "lucy");
    }
}
