package common;



/**
 * Created by xinjian.ye on 2017/12/15.
 */
public class Artist {
    private String name;
    private Integer age;
    private String national;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public Artist(String name, Integer age, String national) {
        this.name = name;
        this.age = age;
        this.national = national;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", national='" + national + '\'' +
                '}';
    }
}
