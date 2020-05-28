package wuxl.study.entity;

import java.io.Serializable;

/**
 * @program: SpringStudy
 * @author: 吴小龙
 * @create: 2020-05-28 16:13
 * @description: 类别类
 */

public class Category implements Serializable {
    public Category(){
        toString();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
