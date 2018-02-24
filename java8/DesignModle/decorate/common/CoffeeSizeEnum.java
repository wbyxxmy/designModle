package DesignModle.decorate.common;

/**
 * Created by xinjian.ye on 2018/2/10.
 */
public enum CoffeeSizeEnum {
    TALL("1.0","小杯"),
    GRANDE("1.3","中杯"),
    VENTI("1.7","大杯");

    String desc;
    String code;

    CoffeeSizeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static CoffeeSizeEnum parse(String code){
        for (CoffeeSizeEnum typeEnum : values()){
            if (typeEnum.getCode().equals(code)){
                return typeEnum;
            }
        }
        return null;
    }
}
