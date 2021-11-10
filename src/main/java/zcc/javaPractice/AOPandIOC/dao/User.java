package zcc.javaPractice.AOPandIOC.dao;

/**
 * @author ：zcc
 * @date ：Created in 2021/11/4 19:21
 * @description：
 * @version: 1
 */

public class User {
    String name;
    int sex;
    int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
