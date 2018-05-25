/**
 * Created by xinjian.ye on 2018/4/8.
 */
public class FindAGirlfriend {
    public People girlfriend;

    public People getGirlfriend() {
        return girlfriend;
    }

    public void setGirlfriend(People someone) {
        if(isAngel(someone)) {
            this.girlfriend = someone;
        }
    }

    private boolean isAngel(People someone) {
        return "FEMALE".equals(someone.getSex());
    }

    public class People {
        private String sex;

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }
    }
}
