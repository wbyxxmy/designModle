package DesignModle.factory.common;

/**
 * Created by xinjian.ye on 2018/2/12.
 */
public enum ChicagoPizzaEnum {
    CHEESE("CHEESE", "奶酪披萨"),
    GREEK("GREEK", "希腊披萨"),
    PEPPERONI("PEPPERONI", "意大利腊香肠披萨"),
    CLAM("CLAM", "蛤蜊披萨"),
    VEGGIE("VEGGIE", "素食比萨");

    String code;
    String desc;

    ChicagoPizzaEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static ChicagoPizzaEnum parse(String code) {
        for(ChicagoPizzaEnum typeEnum : values()) {
            if(typeEnum.getCode().equals(code)) {
                return typeEnum;
            }
        }
        return null;
    }
}
