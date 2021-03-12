package com.example.raspberry.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PropertiesLatest {

    /**
     * result : [{"id":"0b2ed533b72b610bf4087f0fec4fa1f4","deviceId":"863808044493155","property":"DescribeInfo","propertyName":"最新上行数据包","type":"string","stringValue":"a0385e00010310000000162c000317ac0000000000000000458a0000000a458a0002000000020000000000000000000000000000000000002f3c","value":"a0385e00010310000000162c000317ac0000000000000000458a0000000a458a0002000000020000000000000000000000000000000000002f3c","formatValue":"a0385e00010310000000162c000317ac0000000000000000458a0000000a458a0002000000020000000000000000000000000000000000002f3c","createTime":1615531052269,"timestamp":1615531052136},{"id":"de5fc252a24ae40c5aedfa93371b37b8","deviceId":"863808044493155","property":"ProductType","propertyName":"产品型号","type":"enum","stringValue":"0001","value":"0001","formatValue":"新界井泵","createTime":1615531052269,"timestamp":1615531052136},{"id":"444577637ca991a3357bf8a6ae34f9d2","deviceId":"863808044493155","property":"StationAddress","propertyName":"目标站地址","type":"string","stringValue":"03","value":"03","formatValue":"03","createTime":1615531052269,"timestamp":1615531052136},{"id":"b5e58c6f4a1f1c9665acc738952ae72c","deviceId":"863808044493155","property":"OutputCurrent","propertyName":"输出电流 ","type":"float","numberValue":0,"value":0,"formatValue":"0.0A","createTime":1615531052269,"timestamp":1615531052136},{"id":"9c2901e598bde6ab5f76d3a55c0b7f93","deviceId":"863808044493155","property":"RunMode","propertyName":"运行模式控制","type":"enum","stringValue":"0000","value":"0000","formatValue":"档位","createTime":1615531052269,"timestamp":1615531052136},{"id":"484948c12cb6560987bc79f14f27ffcc","deviceId":"863808044493155","property":"BusVoltage","propertyName":"输入电压","type":"int","numberValue":428,"value":428,"formatValue":"428V","createTime":1615531052269,"timestamp":1615531052136},{"id":"e5cafecbcb058d123b6bf7c6161b613e","deviceId":"863808044493155","property":"OutputVoltage","propertyName":"输出电压","type":"int","numberValue":0,"value":0,"formatValue":"0V","createTime":1615531052269,"timestamp":1615531052136},{"id":"71e97094f9a3ebc6a41e279472a60fc0","deviceId":"863808044493155","property":"ConstantPressurePoint","propertyName":"恒压点","type":"float","numberValue":0,"value":0,"formatValue":"0.0bar","createTime":1615531052269,"timestamp":1615531052136},{"id":"efd0844e3062309cf63e49801c01c55c","deviceId":"863808044493155","property":"RunLevel","propertyName":"档位控制","type":"enum","stringValue":"0002","value":"0002","formatValue":"三档","createTime":1615531052269,"timestamp":1615531052136},{"id":"136338215e130ee7a2b2f6d93a94fd5c","deviceId":"863808044493155","property":"CommandSrc","propertyName":"操控指令来源选择","type":"enum","stringValue":"0000","value":"0000","formatValue":"操作面板","createTime":1615531052269,"timestamp":1615531052136},{"id":"0615a70014fb0733f42a6b40c740abc2","deviceId":"863808044493155","property":"CurrentDir","propertyName":"运行方向","type":"enum","stringValue":"0000","value":"0000","formatValue":"反转","createTime":1615531052269,"timestamp":1615531052136},{"id":"902ae243c74a62d42caca4c04fe059f4","deviceId":"863808044493155","property":"ErrorInfo","propertyName":"故障信息","type":"enum","stringValue":"0000","value":"0000","formatValue":"无故障","createTime":1615531052269,"timestamp":1615531052136},{"id":"8c1393ef01707b56eea85f5510b4bfd2","deviceId":"863808044493155","property":"MotorSpeed","propertyName":"电机转速 ","type":"int","numberValue":0,"value":0,"formatValue":"0r/min","createTime":1615531052269,"timestamp":1615531052136},{"id":"05576297891b8db38820ff36f82eac6c","deviceId":"863808044493155","property":"EndPressurePoint","propertyName":"停机压力点","type":"float","numberValue":0,"value":0,"formatValue":"0.0bar","createTime":1615531052269,"timestamp":1615531052136},{"id":"97b77ad5f8f85b38a971019a2afd5056","deviceId":"863808044493155","property":"FanTemperature","propertyName":"散热器温度","type":"int","numberValue":10,"value":10,"formatValue":"10℃","createTime":1615531052269,"timestamp":1615531052136},{"id":"201a5b665cb7b504e546d27f63afa70f","deviceId":"863808044493155","property":"LockFunCode","propertyName":"锁定功能码内容","type":"enum","stringValue":"0000","value":"0000","formatValue":"可修改","createTime":1615531052269,"timestamp":1615531052136},{"id":"9efbd24c9df2416e7054e70035673957","deviceId":"863808044493155","property":"PumpPressure","propertyName":"水泵压力","type":"float","numberValue":0,"value":0,"formatValue":"0.0Bar","createTime":1615531052269,"timestamp":1615531052136},{"id":"0480e76deb4a57be20ffe38c04c3e5d8","deviceId":"863808044493155","property":"PumpPressureRange","propertyName":"压力传感器量程 ","type":"float","numberValue":0,"value":0,"formatValue":"0.0bar","createTime":1615531052269,"timestamp":1615531052136},{"id":"e8ba698cee69ac6a7a4fe31b832f33d7","deviceId":"863808044493155","property":"RunState","propertyName":"运行状态","type":"enum","stringValue":"0003","value":"0003","formatValue":"减速停机","createTime":1615531052269,"timestamp":1615531052136},{"id":"f7034fe83c476165b280eaf399e6321b","deviceId":"863808044493155","property":"Runtime","propertyName":"当前运行时间","type":"float","numberValue":29.72934,"value":29.72934,"formatValue":"29.7h","createTime":1615531052269,"timestamp":1615531052136},{"id":"88bb496fcfb87dec9481c06777151f06","deviceId":"863808044493155","property":"StartPressurePoint","propertyName":"启动压力点","type":"float","numberValue":0,"value":0,"formatValue":"0.0bar","createTime":1615531052269,"timestamp":1615531052136},{"id":"35e25725f20968216312a77a70a76228","deviceId":"863808044493155","property":"StartTimePoint","propertyName":"定时启停的运行时间","type":"float","numberValue":0,"value":0,"formatValue":"0.0h","createTime":1615531052269,"timestamp":1615531052136},{"id":"efa13704cf5d9de8767dff243d5de349","deviceId":"863808044493155","property":"ToTalRuntime","propertyName":"累计运行时间","type":"int","numberValue":17802,"value":17802,"formatValue":"17802h","createTime":1615531052269,"timestamp":1615531052136},{"id":"e2d0fd306eea632818522c7e4f037c9c","deviceId":"863808044493155","property":"endTimePoint","propertyName":"定时启停的停止时间 ","type":"float","numberValue":0,"value":0,"formatValue":"0.0h","createTime":1615531052269,"timestamp":1615531052136},{"id":"e977217ee2b55b77cac08e26cf7a9021","deviceId":"863808044493155","property":"signal","propertyName":"信号质量","type":"int","numberValue":2,"value":2,"formatValue":2,"createTime":1615531052269,"timestamp":1615531052136},{"id":"0ab0850afa1d1fff34301529edcbf654","deviceId":"863808044493155","property":"MotorSwitch","propertyName":"启停控制  ","type":"enum","stringValue":"0006","value":"0006","formatValue":"减速停机","createTime":1613963271132,"timestamp":1613963271132},{"id":"1e2d89e5e39351a7ad65436b645e00ed","deviceId":"863808044493155","property":"setMessage","value":"已下发,等待设备上报","createTime":1613607155503,"timestamp":1613607155503},{"id":"b50f4dabb7b2aaabe0228eb990591dfa","deviceId":"863808044493155","property":"HeartBeatPeriod","propertyName":"心跳包上传周期","type":"int","numberValue":962,"value":962,"formatValue":962,"createTime":1613607156905,"timestamp":1613607156844},{"id":"33d18ed109c7d95965d3d97379cac488","deviceId":"863808044493155","property":"ICCID","propertyName":"ICCID字符串","type":"string","stringValue":"8986111921200402574","value":"8986111921200402574","formatValue":"8986111921200402574","createTime":1612002201947,"timestamp":1612002201909}]
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

    public static class Result {
        /**
         * id : 0b2ed533b72b610bf4087f0fec4fa1f4
         * deviceId : 863808044493155
         * property : DescribeInfo
         * propertyName : 最新上行数据包
         * type : string
         * stringValue : a0385e00010310000000162c000317ac0000000000000000458a0000000a458a0002000000020000000000000000000000000000000000002f3c
         * value : a0385e00010310000000162c000317ac0000000000000000458a0000000a458a0002000000020000000000000000000000000000000000002f3c
         * formatValue : a0385e00010310000000162c000317ac0000000000000000458a0000000a458a0002000000020000000000000000000000000000000000002f3c
         * createTime : 1615531052269
         * timestamp : 1615531052136
         * numberValue : 0
         */

        @SerializedName("id")
        private String id;
        @SerializedName("deviceId")
        private String deviceId;
        @SerializedName("property")
        private String property;
        @SerializedName("propertyName")
        private String propertyName;
        @SerializedName("type")
        private String type;
        @SerializedName("stringValue")
        private String stringValue;
        @SerializedName("value")
        private String value;
        @SerializedName("formatValue")
        private String formatValue;
        @SerializedName("createTime")
        private Long createTime;
        @SerializedName("timestamp")
        private Long timestamp;
        @SerializedName("numberValue")
        private String numberValue;

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

        public String getProperty() {
            return property;
        }

        public void setProperty(String property) {
            this.property = property;
        }

        public String getPropertyName() {
            return propertyName;
        }

        public void setPropertyName(String propertyName) {
            this.propertyName = propertyName;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getStringValue() {
            return stringValue;
        }

        public void setStringValue(String stringValue) {
            this.stringValue = stringValue;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getFormatValue() {
            return formatValue;
        }

        public void setFormatValue(String formatValue) {
            this.formatValue = formatValue;
        }

        public Long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Long createTime) {
            this.createTime = createTime;
        }

        public Long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
        }

        public String getNumberValue() {
            return numberValue;
        }

        public void setNumberValue(String numberValue) {
            this.numberValue = numberValue;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "id='" + id + '\'' +
                    ", deviceId='" + deviceId + '\'' +
                    ", property='" + property + '\'' +
                    ", propertyName='" + propertyName + '\'' +
                    ", type='" + type + '\'' +
                    ", stringValue='" + stringValue + '\'' +
                    ", value='" + value + '\'' +
                    ", formatValue='" + formatValue + '\'' +
                    ", createTime=" + createTime +
                    ", timestamp=" + timestamp +
                    ", numberValue='" + numberValue + '\'' +
                    '}';
        }
    }
}
