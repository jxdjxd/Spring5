package service;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * REQUIRED: 如果有事务在运行，当前方法就在这个事务内运行，否则，就启动一个新的事务，并在自己的事务内运行
 * REQUIRED_NEW: 当前方法必须启动新事务，并在它自己的事务内运行，如果有事务正在运行，应该将它挂起
 * propagation默认就是REQUIRED
 * @author jxd
 * @date 2021/10/25 19:32
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 转账方法
     */
    public void transferAccounts(){
        userDao.addMoney();
        // 测试产生异常
        int i = 10 / 0;
        userDao.reduceMoney();
    }
}
