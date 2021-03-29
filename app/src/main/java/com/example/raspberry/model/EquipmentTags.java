package com.example.raspberry.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EquipmentTags {

    /**
     * result : [{"id":"8edf2092d36287d6d68e08495063f9bc","deviceId":"863808044407981","key":"owner","name":"所属用户","value":"1367669665890861056","type":"string","createTime":1615253137149}]
     * status : 200
     * code : success
     */

    @SerializedName("result")
    private List<Result> result;
    @SerializedName("status")
    private Integer status;
    @SerializedName("code")
    private String code;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "EquipmentLabel{" +
                "result=" + result +
                ", status=" + status +
                ", code='" + code + '\'' +
                '}';
    }

    public static class Result {
        /**
         * id : 8edf2092d36287d6d68e08495063f9bc
         * deviceId : 863808044407981
         * key : owner
         * name : 所属用户
         * value : 1367669665890861056
         * type : string
         * createTime : 1615253137149
         */

        @SerializedName("id")
        private String id;
        @SerializedName("deviceId")
        private String deviceId;
        @SerializedName("key")
        private String key;
        @SerializedName("name")
        private String name;
        @SerializedName("value")
        private String value;
        @SerializedName("type")
        private String type;
        @SerializedName("createTime")
        private Long createTime;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Long createTime) {
            this.createTime = createTime;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "id='" + id + '\'' +
                    ", deviceId='" + deviceId + '\'' +
                    ", key='" + key + '\'' +
                    ", name='" + name + '\'' +
                    ", value='" + value + '\'' +
                    ", type='" + type + '\'' +
                    ", createTime=" + createTime +
                    '}';
        }
    }
}
