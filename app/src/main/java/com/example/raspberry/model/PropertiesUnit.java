package com.example.raspberry.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PropertiesUnit {


    /**
     * result : {"id":"863808044493155","name":"公司测试2","protocol":"shimge_nb_ctwig_V1","protocolName":"shimge_nb_ctwig_V1","transport":"HTTP","productId":"shimge-nb","productName":"新界井泵","deviceType":{"text":"直连设备","value":"device"},"state":{"text":"在线","value":"online"},"address":"/180.106.150.31:27735","onlineTime":1615653469799,"offlineTime":1615620566350,"createTime":1614670648219,"registerTime":1614670648332,"metadata":"{\"events\":[],\"properties\":[{\"id\":\"DescribeInfo\",\"name\":\"最新上行数据包\",\"valueType\":{\"type\":\"string\",\"expands\":{}},\"expands\":{\"readOnly\":\"true\"}},{\"id\":\"MotorSwitch\",\"name\":\"启停控制  \",\"valueType\":{\"type\":\"enum\",\"elements\":[{\"text\":\"正转运行\",\"value\":\"0001\",\"id\":0},{\"id\":2,\"value\":\"0002\",\"text\":\"反转运行\"},{\"id\":6,\"value\":\"0006\",\"text\":\"减速停机\"},{\"id\":7,\"text\":\"故障复位\",\"value\":\"0007\"}]},\"expands\":{\"readOnly\":\"false\"},\"description\":\"地址：121\\n0001：正转运行\\n0002：反转运行\\n0006：减速停机\\n0007：故障复位\\n（数据只写）\\n485端口通讯地址：0x2000\"},{\"id\":\"RunState\",\"name\":\"运行状态\",\"valueType\":{\"type\":\"enum\",\"elements\":[{\"text\":\"正转运行\",\"value\":\"0001\",\"id\":0},{\"id\":2,\"value\":\"0003\",\"text\":\"减速停机\"},{\"id\":3,\"value\":\"0002\",\"text\":\"反转运行\"},{\"id\":4,\"value\":\"0000\",\"text\":\"通讯异常\"},{\"id\":5,\"value\":\"0005\",\"text\":\"故障状态\"},{\"id\":6,\"value\":\"0004\",\"text\":\"调谐\"}]},\"expands\":{\"readOnly\":\"true\"},\"description\":\" 地址：0\\n0x0001：正转运行\\n0x0002：反转运行\\n0x0003：停机\\t\\n（数据只读）\\n--------只分运行、停机\\n485端口通讯地址：0x3000\\n\"},{\"id\":\"BusVoltage\",\"name\":\"输入电压\",\"valueType\":{\"type\":\"int\",\"unit\":\"volt\"},\"expands\":{\"readOnly\":\"true\"},\"description\":\"（母线电压） 地址：1\\n0x0020：3.2V\\t\\n（数据只读）\\n------精度1\\n------单位V\\n485端口通讯地址：0x7002\"},{\"id\":\"OutputVoltage\",\"name\":\"输出电压\",\"valueType\":{\"type\":\"int\",\"unit\":\"volt\"},\"expands\":{\"readOnly\":\"true\"},\"description\":\" 地址：2\\n0x0020：32V\\t\\n（数据只读）\\n------精度1\\n------单位V\\n485端口通讯地址：0x7003\"},{\"id\":\"OutputCurrent\",\"name\":\"输出电流 \",\"valueType\":{\"type\":\"float\",\"scale\":1,\"unit\":\"ampere\"},\"expands\":{\"readOnly\":\"true\"},\"description\":\"地址：3\\n0x0020：0.32A\\n\\t（数据只读）\\n------精度0.1\\n------单位A\\n485端口通讯地址：0x7004\"},{\"id\":\"MotorSpeed\",\"name\":\"电机转速 \",\"valueType\":{\"type\":\"int\",\"unit\":\"turnPerSeconds\"},\"expands\":{\"readOnly\":\"true\"},\"description\":\"地址：5\\n0x0020：32RPM\\n\\t（数据只读）\\n------精度1\\n------单位rpm（r/min）\\n485端口通讯地址：0x7024\"},{\"id\":\"Runtime\",\"name\":\"当前运行时间\",\"valueType\":{\"type\":\"float\",\"scale\":1,\"unit\":\"hour\"},\"expands\":{\"readOnly\":\"true\"},\"description\":\"地址 6\\n0x0020：3.2min\\t\\n（数据只读）\\n------精度0.1\\n------单位小时\\n485端口通讯地址：0x7026\"},{\"id\":\"ErrorInfo\",\"name\":\"故障信息\",\"valueType\":{\"type\":\"enum\",\"elements\":[{\"text\":\"无故障\",\"value\":\"0000\",\"id\":0},{\"id\":2,\"value\":\"0001\",\"text\":\"保留\"},{\"id\":3,\"value\":\"0002\",\"text\":\"加速过电流\"},{\"id\":4,\"value\":\"0003\",\"text\":\"减速过电流\"},{\"id\":5,\"value\":\"0004\",\"text\":\"恒速过电流\"},{\"id\":6,\"value\":\"0005\",\"text\":\"加速过电压\"},{\"id\":7,\"value\":\"0006\",\"text\":\"减速过电压\"},{\"id\":8,\"value\":\"0007\",\"text\":\"恒速过电压\"},{\"id\":9,\"value\":\"0008\",\"text\":\"缓冲电阻过载故障\"},{\"id\":10,\"value\":\"0009\",\"text\":\"欠压故障\"},{\"id\":11,\"value\":\"000A\",\"text\":\"变频器过载\"},{\"id\":12,\"value\":\"000B\",\"text\":\"电机过载\"},{\"id\":13,\"value\":\"000C\",\"text\":\"输入缺相\"},{\"id\":14,\"value\":\"000D\",\"text\":\"输出缺相\"},{\"id\":15,\"value\":\"000E\",\"text\":\"模块过热\"},{\"id\":16,\"value\":\"000F\",\"text\":\"外部故障\"},{\"id\":17,\"value\":\"0010\",\"text\":\"通讯故障\"},{\"id\":18,\"value\":\"0011\",\"text\":\"接触器故障\"},{\"id\":19,\"value\":\"0012\",\"text\":\"电流检测故障\"},{\"id\":20,\"value\":\"0013\",\"text\":\"电机调谐故障\"},{\"id\":21,\"value\":\"0015\",\"text\":\"参数读写异常\"},{\"id\":22,\"value\":\"0016\",\"text\":\"变频器硬件故障\"},{\"id\":23,\"value\":\"0017\",\"text\":\"电机对地短路故障\"},{\"id\":24,\"value\":\"0018\",\"text\":\"保留\"},{\"id\":25,\"value\":\"0019\",\"text\":\"保留\"},{\"id\":26,\"value\":\"001A\",\"text\":\"运行时间到达\"},{\"id\":27,\"value\":\"001B\",\"text\":\"用户自定义故障1\"},{\"id\":28,\"value\":\"001C\",\"text\":\"用户自定义故障2\"},{\"id\":29,\"value\":\"001D\",\"text\":\"上电时间到达\"},{\"id\":30,\"value\":\"001E\",\"text\":\"掉载\"},{\"id\":31,\"value\":\"001F\",\"text\":\"运行时PID反馈丢失\"},{\"id\":32,\"value\":\"0028\",\"text\":\"快速限流超时故障\"},{\"id\":33,\"value\":\"0029\",\"text\":\"运行时切换电机故障\"},{\"id\":34,\"value\":\"002D\",\"text\":\"电机过温\"}]},\"expands\":{\"readOnly\":\"true\"},\"description\":\"故障信息\\t0000：无故障\\n0001：保留\\n0002：加速过电流\\n0003：减速过电流\\n0004：恒速过电流\\n0005：加速过电压\\n0006：减速过电压\\n0007：恒速过电压\\n0008：缓冲电阻过载故障\\n0009：欠压故障\\n000A：变频器过载\\n000B：电机过载\\n000C：输入缺相\\n000D：输出缺相\\n000E：模块过热\\n000F：外部故障\\n0010：通讯故障\\n0011：接触器故障\\n0012：电流检测故障\\n0013：电机调谐故障\\n0015：参数读写异常\\n0016：变频器硬件故障\\n0017：电机对地短路故障\\n0018：保留\\n0019：保留\\n001A：运行时间到达\\n001B：用户自定义故障1\\n001C：用户自定义故障2\\n001D：上电时间到达\\n001E：掉载\\n001F：运行时PID反馈丢失\\n0028：快速限流超时故障\\n0029：运行时切换电机故障\\n002D：电机过温\\t（数据只读）\\n485端口通讯地址：0x7045\"},{\"id\":\"FanTemperature\",\"name\":\"散热器温度\",\"valueType\":{\"type\":\"int\",\"unit\":\"celsiusDegrees\"},\"expands\":{\"readOnly\":\"true\"},\"description\":\" 地址：8\\n0x10：16℃\\t\\n（数据只读）\\n------精度1\\n------单位℃\\n485端口通讯地址：0x0707\"},{\"id\":\"ToTalRuntime\",\"name\":\"累计运行时间\",\"valueType\":{\"type\":\"int\",\"unit\":\"hour\"},\"expands\":{\"readOnly\":\"true\"},\"description\":\" 地址：9\\n0x10：16小时\\t\\n（数据只读）\\n------精度1\\n------单位小时\\n485端口通讯地址：0x0709\"},{\"id\":\"PumpPressure\",\"name\":\"水泵压力\",\"valueType\":{\"type\":\"float\",\"scale\":1,\"unit\":\"Bar\"},\"expands\":{\"readOnly\":\"true\"},\"description\":\" 地址：4\\n0x0020：0.32V\\t\\n（数据只读）\\n------精度0.01\\n------单位V\\n485端口通讯地址：0x7009\"},{\"id\":\"CurrentDir\",\"name\":\"运行方向\",\"valueType\":{\"type\":\"enum\",\"elements\":[{\"text\":\"正转\",\"value\":\"0001\",\"id\":0},{\"id\":2,\"value\":\"0000\",\"text\":\"反转\"}]},\"expands\":{\"readOnly\":\"false\"},\"description\":\" 地址11\\n0000：默认方向运行\\n0001：与默认方向相反的方向运行\\t\\n（可读可写）\\n485端口通讯地址：0xF009\"},{\"id\":\"signal\",\"name\":\"信号质量\",\"valueType\":{\"type\":\"int\"},\"expands\":{\"readOnly\":\"true\"},\"description\":\" 地址：10\\n0x17：信号质量23\\t\\n（数据只读）\\n数据范围0-31\\n\"},{\"id\":\"ResetFactory\",\"name\":\"恢复出厂设置\",\"valueType\":{\"type\":\"enum\",\"elements\":[{\"text\":\"恢复出厂\",\"value\":\"0001\",\"id\":0}]},\"expands\":{\"readOnly\":\"false\"},\"description\":\" 地址122\\n0001：恢复出厂\\n\\t（数据只写）\\n485端口通讯地址：0x1F01\\n\"},{\"id\":\"PumpPressureRange\",\"name\":\"压力传感器量程 \",\"valueType\":{\"type\":\"float\",\"scale\":1,\"unit\":\"bar\"},\"expands\":{\"readOnly\":\"false\"},\"description\":\"地址：15\\n0x0010：0.16Mpa\\t\\n（可读可写）\\n485端口通讯地址：0xA403\"},{\"id\":\"StartTimePoint\",\"name\":\"定时启停的运行时间\",\"valueType\":{\"type\":\"float\",\"scale\":1,\"unit\":\"hour\"},\"expands\":{\"readOnly\":\"false\"},\"description\":\" 地址：18\\n0x0010：1.6小时\\t\\n（可读可写）\\n------精度0.1\\n------单位小时\\n------数据范围0-99小时\\n485端口通讯地址：0xA406\\n\"},{\"id\":\"endTimePoint\",\"name\":\"定时启停的停止时间 \",\"valueType\":{\"type\":\"float\",\"scale\":1,\"unit\":\"hour\"},\"expands\":{\"readOnly\":\"false\"},\"description\":\"地址：19\\n0x0010：1.6小时\\t\\n（可读可写）\\n------精度0.1\\n------单位小时\\n------数据范围0-99小时\\n485端口通讯地址：0xA407\"},{\"id\":\"ConstantPressurePoint\",\"name\":\"恒压点\",\"valueType\":{\"type\":\"float\",\"scale\":1,\"unit\":\"bar\"},\"expands\":{\"readOnly\":\"false\"},\"description\":\" 地址：14\\n0x0010：0.16Mpa\\t\\n（可读可写）\\n------精度0.01\\n------单位Mpa\\n------数据范围0-传感器最大量程\\n485端口通讯地址：0xA402\"},{\"id\":\"StartPressurePoint\",\"name\":\"启动压力点\",\"valueType\":{\"type\":\"float\",\"scale\":1,\"unit\":\"bar\"},\"expands\":{\"readOnly\":\"false\"},\"description\":\" 地址：16\\n0x0010：0.16Mpa\\t\\n（可读可写）\\n------精度0.01\\n------单位Mpa\\n------数据范围0-传感器最大量程\\n485端口通讯地址：0xA404\"},{\"id\":\"EndPressurePoint\",\"name\":\"停机压力点\",\"valueType\":{\"type\":\"float\",\"scale\":1,\"unit\":\"bar\"},\"expands\":{\"readOnly\":\"false\"},\"description\":\" 地址：17\\n0x0010：0.16Mpa\\t\\n（可读可写）\\n------精度0.01\\n------单位Mpa\\n------数据范围0-传感器最大量程\\n485端口通讯地址：0xA405\"},{\"id\":\"UserDataUpdatePeriod\",\"name\":\"用户类数据上传周期\",\"valueType\":{\"type\":\"int\"},\"expands\":{\"readOnly\":\"false\"},\"description\":\" 地址：240\\n低4位用于显示当前数据单位：\\n0000：数据更新时上传；\\n1111：不进行数据上传；\\n0001：x秒上传一次；\\n0010：x分钟上传一次；\\n0100：x小时上传一次；\\n高12位用于显示当前上传周期：\\n在设置周期上传的时候（低4位为0001/0010/0100），高6位需从1-4095中取值； \"},{\"id\":\"ExpertDataUpdatePeriod\",\"name\":\"专业类数据上传周期\",\"valueType\":{\"type\":\"int\"},\"expands\":{\"readOnly\":\"false\"},\"description\":\" 地址：241\\n低4位用于显示当前数据单位：\\n0000,1111：不进行数据上传；\\n0001：x秒上传一次；\\n0010：x分钟上传一次；\\n0100：x小时上传一次；\\n高12位用于显示当前上传周期：\\n在设置周期上传的时候（低4位为0001/0010/0100），高6位需从1-4095中取值\"},{\"id\":\"HeartBeatPeriod\",\"name\":\"心跳包上传周期\",\"valueType\":{\"type\":\"int\"},\"expands\":{\"readOnly\":\"false\"},\"description\":\" 地址：244\"},{\"id\":\"RunMode\",\"name\":\"运行模式控制\",\"valueType\":{\"type\":\"enum\",\"elements\":[{\"text\":\"档位\",\"value\":\"0000\",\"id\":0},{\"id\":2,\"value\":\"0001\",\"text\":\"浮球\"},{\"id\":3,\"value\":\"0002\",\"text\":\"恒压\"},{\"id\":4,\"value\":\"0003\",\"text\":\"压力启停\"},{\"id\":5,\"value\":\"0004\",\"text\":\"定时\"},{\"id\":6,\"value\":\"0005\",\"text\":\"定时恒压\"}]},\"expands\":{\"readOnly\":\"false\"},\"description\":\"（原浮球压力开关位置）地址：13\\n0000：档位模式\\n0001：浮球模式\\n0002：恒压模式\\n0003：压力启停模式\\n0004：定时模式\\n0005：恒压和定时组合模式\\t（可读可写）\\n485端口通讯地址：0xA400\\n\"},{\"id\":\"RunLevel\",\"name\":\"档位控制\",\"valueType\":{\"type\":\"enum\",\"elements\":[{\"text\":\"一档\",\"value\":\"0000\",\"id\":0},{\"id\":2,\"text\":\"二档\",\"value\":\"0001\"},{\"id\":3,\"text\":\"三档\",\"value\":\"0002\"},{\"id\":4,\"text\":\"四档\",\"value\":\"0003\"},{\"id\":5,\"text\":\"五档\",\"value\":\"0004\"}]},\"expands\":{\"readOnly\":\"false\"},\"description\":\" 地址：12\\n0000：一档\\n0001：二档\\n0002：三档\\n0003：四档\\n0004：五档\\t（可读可写）\\n485端口通讯地址：0xA419\\n\"},{\"id\":\"location\",\"name\":\"地理位置\",\"valueType\":{\"type\":\"geoPoint\"},\"expands\":{\"readOnly\":\"true\"}},{\"id\":\"ICCID\",\"name\":\"ICCID字符串\",\"valueType\":{\"type\":\"string\",\"expands\":{}},\"expands\":{\"readOnly\":\"true\"}},{\"id\":\"LockFunCode\",\"name\":\"锁定功能码内容\",\"valueType\":{\"type\":\"enum\",\"elements\":[{\"text\":\"可修改\",\"value\":\"0000\",\"id\":0},{\"id\":2,\"value\":\"0001\",\"text\":\"不可修改\"}]},\"expands\":{\"readOnly\":\"false\"},\"description\":\"地址21\"},{\"id\":\"CommandSrc\",\"name\":\"操控指令来源选择\",\"valueType\":{\"type\":\"enum\",\"elements\":[{\"text\":\"操作面板\",\"value\":\"0000\",\"id\":0},{\"id\":2,\"value\":\"0001\",\"text\":\"端子\"},{\"id\":3,\"value\":\"0002\",\"text\":\"485指令\"}]},\"expands\":{\"readOnly\":\"false\"},\"description\":\"地址20\"},{\"id\":\"ProductType\",\"name\":\"产品型号\",\"valueType\":{\"type\":\"enum\",\"elements\":[{\"text\":\"新界井泵\",\"value\":\"0001\",\"id\":0}]},\"expands\":{\"readOnly\":\"false\"},\"description\":\"地址242\"},{\"id\":\"StationAddress\",\"name\":\"目标站地址\",\"valueType\":{\"type\":\"string\",\"expands\":{\"maxLength\":\"2\"}},\"expands\":{\"readOnly\":\"false\"},\"description\":\"地址243\"}],\"functions\":[{\"id\":\"registerOC\",\"name\":\"注册电信平台\",\"async\":false,\"output\":{\"type\":\"boolean\",\"trueText\":\"注册成果\",\"trueValue\":\"1\",\"falseText\":\"注册失败\",\"falseValue\":\"0\"},\"inputs\":[]},{\"id\":\"deleteOC\",\"name\":\"删除电信平台注册设备\",\"async\":false,\"output\":{},\"inputs\":[]},{\"id\":\"givingOrderOC\",\"name\":\"通过电信平台操作设备\",\"async\":false,\"output\":{},\"inputs\":[{\"id\":\"DownStreamData\",\"name\":\"DownStreamData\",\"valueType\":{\"type\":\"string\"}}]},{\"id\":\"getPosition\",\"name\":\"获取定位信息\",\"async\":true,\"output\":{},\"inputs\":[]}],\"tags\":[{\"id\":\"IMEI\",\"name\":\"IMEI\",\"valueType\":{\"type\":\"string\",\"expands\":{}},\"expands\":{\"readOnly\":\"false\"}},{\"id\":\"location\",\"name\":\"坐标\",\"valueType\":{\"type\":\"geoPoint\"},\"expands\":{\"readOnly\":\"false\"}}]}","configuration":{},"cachedConfiguration":{},"aloneConfiguration":false,"parentId":"","connectServerId":"jetlinks-platform:8848","tags":[{"id":"d4d4ef03c75da4353be4521b55deec50","key":"location","name":"坐标","type":"geoPoint","createTime":1615779930156},{"id":"929d1d3817c1b686c95a4b699368313d","key":"IMEI","name":"IMEI","type":"string","createTime":1615779930156}],"binds":[{"id":"dbde486efd110c2fde66d7bb40f4f454","bindType":"ctWing","bindName":"ctWing","bindKey":"83ae556ea19a4d9f8cfc6399b916834b"},{"id":"558efdd09d6798e53290702501301e63","bindType":"ctWing","bindName":"ctWing","bindKey":"247cb3ccdc154840a6300235d221f5e1"},{"id":"a295be10cf5e78067cfd72daa5d18e29","bindType":"ctWing","bindName":"ctWing","bindKey":"180ba31a43c8408496c801a696fc10b5"},{"id":"37a540235bf58be85c93300748db7d1b","bindType":"ctWing","bindName":"ctWing","bindKey":"10f6c4b4d2e34f5b8b3422389544c81c"},{"id":"d224a06a6e64fc544ff5c15871023de1","bindType":"ctWing","bindName":"ctWing","bindKey":"d7d0214a5aa24174a743c42c0feae0dd"},{"id":"b9e90148c91e7e328149998e183a11c3","bindType":"ctWing","bindName":"ctWing","bindKey":"63c655137c7543f89c4fb3c242f5a3d9"},{"id":"c0b92add3f05c901ca79a9b9664c2890","bindType":"ctWing","bindName":"ctWing","bindKey":"a34a85abd4ac470fbc5451c73e7d2ff8"}]}
     * status : 200
     * code : success
     */

    @SerializedName("result")
    private Result result;
    @SerializedName("status")
    private Integer status;
    @SerializedName("code")
    private String code;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
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
         * id : 863808044493155
         * name : 公司测试2
         * protocol : shimge_nb_ctwig_V1
         * protocolName : shimge_nb_ctwig_V1
         * transport : HTTP
         * productId : shimge-nb
         * productName : 新界井泵
         * deviceType : {"text":"直连设备","value":"device"}
         * state : {"text":"在线","value":"online"}
         * address : /180.106.150.31:27735
         * onlineTime : 1615653469799
         * offlineTime : 1615620566350
         * createTime : 1614670648219
         * registerTime : 1614670648332
         * metadata : {"events":[],"properties":[{"id":"DescribeInfo","name":"最新上行数据包","valueType":{"type":"string","expands":{}},"expands":{"readOnly":"true"}},{"id":"MotorSwitch","name":"启停控制  ","valueType":{"type":"enum","elements":[{"text":"正转运行","value":"0001","id":0},{"id":2,"value":"0002","text":"反转运行"},{"id":6,"value":"0006","text":"减速停机"},{"id":7,"text":"故障复位","value":"0007"}]},"expands":{"readOnly":"false"},"description":"地址：121\n0001：正转运行\n0002：反转运行\n0006：减速停机\n0007：故障复位\n（数据只写）\n485端口通讯地址：0x2000"},{"id":"RunState","name":"运行状态","valueType":{"type":"enum","elements":[{"text":"正转运行","value":"0001","id":0},{"id":2,"value":"0003","text":"减速停机"},{"id":3,"value":"0002","text":"反转运行"},{"id":4,"value":"0000","text":"通讯异常"},{"id":5,"value":"0005","text":"故障状态"},{"id":6,"value":"0004","text":"调谐"}]},"expands":{"readOnly":"true"},"description":" 地址：0\n0x0001：正转运行\n0x0002：反转运行\n0x0003：停机\t\n（数据只读）\n--------只分运行、停机\n485端口通讯地址：0x3000\n"},{"id":"BusVoltage","name":"输入电压","valueType":{"type":"int","unit":"volt"},"expands":{"readOnly":"true"},"description":"（母线电压） 地址：1\n0x0020：3.2V\t\n（数据只读）\n------精度1\n------单位V\n485端口通讯地址：0x7002"},{"id":"OutputVoltage","name":"输出电压","valueType":{"type":"int","unit":"volt"},"expands":{"readOnly":"true"},"description":" 地址：2\n0x0020：32V\t\n（数据只读）\n------精度1\n------单位V\n485端口通讯地址：0x7003"},{"id":"OutputCurrent","name":"输出电流 ","valueType":{"type":"float","scale":1,"unit":"ampere"},"expands":{"readOnly":"true"},"description":"地址：3\n0x0020：0.32A\n\t（数据只读）\n------精度0.1\n------单位A\n485端口通讯地址：0x7004"},{"id":"MotorSpeed","name":"电机转速 ","valueType":{"type":"int","unit":"turnPerSeconds"},"expands":{"readOnly":"true"},"description":"地址：5\n0x0020：32RPM\n\t（数据只读）\n------精度1\n------单位rpm（r/min）\n485端口通讯地址：0x7024"},{"id":"Runtime","name":"当前运行时间","valueType":{"type":"float","scale":1,"unit":"hour"},"expands":{"readOnly":"true"},"description":"地址 6\n0x0020：3.2min\t\n（数据只读）\n------精度0.1\n------单位小时\n485端口通讯地址：0x7026"},{"id":"ErrorInfo","name":"故障信息","valueType":{"type":"enum","elements":[{"text":"无故障","value":"0000","id":0},{"id":2,"value":"0001","text":"保留"},{"id":3,"value":"0002","text":"加速过电流"},{"id":4,"value":"0003","text":"减速过电流"},{"id":5,"value":"0004","text":"恒速过电流"},{"id":6,"value":"0005","text":"加速过电压"},{"id":7,"value":"0006","text":"减速过电压"},{"id":8,"value":"0007","text":"恒速过电压"},{"id":9,"value":"0008","text":"缓冲电阻过载故障"},{"id":10,"value":"0009","text":"欠压故障"},{"id":11,"value":"000A","text":"变频器过载"},{"id":12,"value":"000B","text":"电机过载"},{"id":13,"value":"000C","text":"输入缺相"},{"id":14,"value":"000D","text":"输出缺相"},{"id":15,"value":"000E","text":"模块过热"},{"id":16,"value":"000F","text":"外部故障"},{"id":17,"value":"0010","text":"通讯故障"},{"id":18,"value":"0011","text":"接触器故障"},{"id":19,"value":"0012","text":"电流检测故障"},{"id":20,"value":"0013","text":"电机调谐故障"},{"id":21,"value":"0015","text":"参数读写异常"},{"id":22,"value":"0016","text":"变频器硬件故障"},{"id":23,"value":"0017","text":"电机对地短路故障"},{"id":24,"value":"0018","text":"保留"},{"id":25,"value":"0019","text":"保留"},{"id":26,"value":"001A","text":"运行时间到达"},{"id":27,"value":"001B","text":"用户自定义故障1"},{"id":28,"value":"001C","text":"用户自定义故障2"},{"id":29,"value":"001D","text":"上电时间到达"},{"id":30,"value":"001E","text":"掉载"},{"id":31,"value":"001F","text":"运行时PID反馈丢失"},{"id":32,"value":"0028","text":"快速限流超时故障"},{"id":33,"value":"0029","text":"运行时切换电机故障"},{"id":34,"value":"002D","text":"电机过温"}]},"expands":{"readOnly":"true"},"description":"故障信息\t0000：无故障\n0001：保留\n0002：加速过电流\n0003：减速过电流\n0004：恒速过电流\n0005：加速过电压\n0006：减速过电压\n0007：恒速过电压\n0008：缓冲电阻过载故障\n0009：欠压故障\n000A：变频器过载\n000B：电机过载\n000C：输入缺相\n000D：输出缺相\n000E：模块过热\n000F：外部故障\n0010：通讯故障\n0011：接触器故障\n0012：电流检测故障\n0013：电机调谐故障\n0015：参数读写异常\n0016：变频器硬件故障\n0017：电机对地短路故障\n0018：保留\n0019：保留\n001A：运行时间到达\n001B：用户自定义故障1\n001C：用户自定义故障2\n001D：上电时间到达\n001E：掉载\n001F：运行时PID反馈丢失\n0028：快速限流超时故障\n0029：运行时切换电机故障\n002D：电机过温\t（数据只读）\n485端口通讯地址：0x7045"},{"id":"FanTemperature","name":"散热器温度","valueType":{"type":"int","unit":"celsiusDegrees"},"expands":{"readOnly":"true"},"description":" 地址：8\n0x10：16℃\t\n（数据只读）\n------精度1\n------单位℃\n485端口通讯地址：0x0707"},{"id":"ToTalRuntime","name":"累计运行时间","valueType":{"type":"int","unit":"hour"},"expands":{"readOnly":"true"},"description":" 地址：9\n0x10：16小时\t\n（数据只读）\n------精度1\n------单位小时\n485端口通讯地址：0x0709"},{"id":"PumpPressure","name":"水泵压力","valueType":{"type":"float","scale":1,"unit":"Bar"},"expands":{"readOnly":"true"},"description":" 地址：4\n0x0020：0.32V\t\n（数据只读）\n------精度0.01\n------单位V\n485端口通讯地址：0x7009"},{"id":"CurrentDir","name":"运行方向","valueType":{"type":"enum","elements":[{"text":"正转","value":"0001","id":0},{"id":2,"value":"0000","text":"反转"}]},"expands":{"readOnly":"false"},"description":" 地址11\n0000：默认方向运行\n0001：与默认方向相反的方向运行\t\n（可读可写）\n485端口通讯地址：0xF009"},{"id":"signal","name":"信号质量","valueType":{"type":"int"},"expands":{"readOnly":"true"},"description":" 地址：10\n0x17：信号质量23\t\n（数据只读）\n数据范围0-31\n"},{"id":"ResetFactory","name":"恢复出厂设置","valueType":{"type":"enum","elements":[{"text":"恢复出厂","value":"0001","id":0}]},"expands":{"readOnly":"false"},"description":" 地址122\n0001：恢复出厂\n\t（数据只写）\n485端口通讯地址：0x1F01\n"},{"id":"PumpPressureRange","name":"压力传感器量程 ","valueType":{"type":"float","scale":1,"unit":"bar"},"expands":{"readOnly":"false"},"description":"地址：15\n0x0010：0.16Mpa\t\n（可读可写）\n485端口通讯地址：0xA403"},{"id":"StartTimePoint","name":"定时启停的运行时间","valueType":{"type":"float","scale":1,"unit":"hour"},"expands":{"readOnly":"false"},"description":" 地址：18\n0x0010：1.6小时\t\n（可读可写）\n------精度0.1\n------单位小时\n------数据范围0-99小时\n485端口通讯地址：0xA406\n"},{"id":"endTimePoint","name":"定时启停的停止时间 ","valueType":{"type":"float","scale":1,"unit":"hour"},"expands":{"readOnly":"false"},"description":"地址：19\n0x0010：1.6小时\t\n（可读可写）\n------精度0.1\n------单位小时\n------数据范围0-99小时\n485端口通讯地址：0xA407"},{"id":"ConstantPressurePoint","name":"恒压点","valueType":{"type":"float","scale":1,"unit":"bar"},"expands":{"readOnly":"false"},"description":" 地址：14\n0x0010：0.16Mpa\t\n（可读可写）\n------精度0.01\n------单位Mpa\n------数据范围0-传感器最大量程\n485端口通讯地址：0xA402"},{"id":"StartPressurePoint","name":"启动压力点","valueType":{"type":"float","scale":1,"unit":"bar"},"expands":{"readOnly":"false"},"description":" 地址：16\n0x0010：0.16Mpa\t\n（可读可写）\n------精度0.01\n------单位Mpa\n------数据范围0-传感器最大量程\n485端口通讯地址：0xA404"},{"id":"EndPressurePoint","name":"停机压力点","valueType":{"type":"float","scale":1,"unit":"bar"},"expands":{"readOnly":"false"},"description":" 地址：17\n0x0010：0.16Mpa\t\n（可读可写）\n------精度0.01\n------单位Mpa\n------数据范围0-传感器最大量程\n485端口通讯地址：0xA405"},{"id":"UserDataUpdatePeriod","name":"用户类数据上传周期","valueType":{"type":"int"},"expands":{"readOnly":"false"},"description":" 地址：240\n低4位用于显示当前数据单位：\n0000：数据更新时上传；\n1111：不进行数据上传；\n0001：x秒上传一次；\n0010：x分钟上传一次；\n0100：x小时上传一次；\n高12位用于显示当前上传周期：\n在设置周期上传的时候（低4位为0001/0010/0100），高6位需从1-4095中取值； "},{"id":"ExpertDataUpdatePeriod","name":"专业类数据上传周期","valueType":{"type":"int"},"expands":{"readOnly":"false"},"description":" 地址：241\n低4位用于显示当前数据单位：\n0000,1111：不进行数据上传；\n0001：x秒上传一次；\n0010：x分钟上传一次；\n0100：x小时上传一次；\n高12位用于显示当前上传周期：\n在设置周期上传的时候（低4位为0001/0010/0100），高6位需从1-4095中取值"},{"id":"HeartBeatPeriod","name":"心跳包上传周期","valueType":{"type":"int"},"expands":{"readOnly":"false"},"description":" 地址：244"},{"id":"RunMode","name":"运行模式控制","valueType":{"type":"enum","elements":[{"text":"档位","value":"0000","id":0},{"id":2,"value":"0001","text":"浮球"},{"id":3,"value":"0002","text":"恒压"},{"id":4,"value":"0003","text":"压力启停"},{"id":5,"value":"0004","text":"定时"},{"id":6,"value":"0005","text":"定时恒压"}]},"expands":{"readOnly":"false"},"description":"（原浮球压力开关位置）地址：13\n0000：档位模式\n0001：浮球模式\n0002：恒压模式\n0003：压力启停模式\n0004：定时模式\n0005：恒压和定时组合模式\t（可读可写）\n485端口通讯地址：0xA400\n"},{"id":"RunLevel","name":"档位控制","valueType":{"type":"enum","elements":[{"text":"一档","value":"0000","id":0},{"id":2,"text":"二档","value":"0001"},{"id":3,"text":"三档","value":"0002"},{"id":4,"text":"四档","value":"0003"},{"id":5,"text":"五档","value":"0004"}]},"expands":{"readOnly":"false"},"description":" 地址：12\n0000：一档\n0001：二档\n0002：三档\n0003：四档\n0004：五档\t（可读可写）\n485端口通讯地址：0xA419\n"},{"id":"location","name":"地理位置","valueType":{"type":"geoPoint"},"expands":{"readOnly":"true"}},{"id":"ICCID","name":"ICCID字符串","valueType":{"type":"string","expands":{}},"expands":{"readOnly":"true"}},{"id":"LockFunCode","name":"锁定功能码内容","valueType":{"type":"enum","elements":[{"text":"可修改","value":"0000","id":0},{"id":2,"value":"0001","text":"不可修改"}]},"expands":{"readOnly":"false"},"description":"地址21"},{"id":"CommandSrc","name":"操控指令来源选择","valueType":{"type":"enum","elements":[{"text":"操作面板","value":"0000","id":0},{"id":2,"value":"0001","text":"端子"},{"id":3,"value":"0002","text":"485指令"}]},"expands":{"readOnly":"false"},"description":"地址20"},{"id":"ProductType","name":"产品型号","valueType":{"type":"enum","elements":[{"text":"新界井泵","value":"0001","id":0}]},"expands":{"readOnly":"false"},"description":"地址242"},{"id":"StationAddress","name":"目标站地址","valueType":{"type":"string","expands":{"maxLength":"2"}},"expands":{"readOnly":"false"},"description":"地址243"}],"functions":[{"id":"registerOC","name":"注册电信平台","async":false,"output":{"type":"boolean","trueText":"注册成果","trueValue":"1","falseText":"注册失败","falseValue":"0"},"inputs":[]},{"id":"deleteOC","name":"删除电信平台注册设备","async":false,"output":{},"inputs":[]},{"id":"givingOrderOC","name":"通过电信平台操作设备","async":false,"output":{},"inputs":[{"id":"DownStreamData","name":"DownStreamData","valueType":{"type":"string"}}]},{"id":"getPosition","name":"获取定位信息","async":true,"output":{},"inputs":[]}],"tags":[{"id":"IMEI","name":"IMEI","valueType":{"type":"string","expands":{}},"expands":{"readOnly":"false"}},{"id":"location","name":"坐标","valueType":{"type":"geoPoint"},"expands":{"readOnly":"false"}}]}
         * configuration : {}
         * cachedConfiguration : {}
         * aloneConfiguration : false
         * parentId :
         * connectServerId : jetlinks-platform:8848
         * tags : [{"id":"d4d4ef03c75da4353be4521b55deec50","key":"location","name":"坐标","type":"geoPoint","createTime":1615779930156},{"id":"929d1d3817c1b686c95a4b699368313d","key":"IMEI","name":"IMEI","type":"string","createTime":1615779930156}]
         * binds : [{"id":"dbde486efd110c2fde66d7bb40f4f454","bindType":"ctWing","bindName":"ctWing","bindKey":"83ae556ea19a4d9f8cfc6399b916834b"},{"id":"558efdd09d6798e53290702501301e63","bindType":"ctWing","bindName":"ctWing","bindKey":"247cb3ccdc154840a6300235d221f5e1"},{"id":"a295be10cf5e78067cfd72daa5d18e29","bindType":"ctWing","bindName":"ctWing","bindKey":"180ba31a43c8408496c801a696fc10b5"},{"id":"37a540235bf58be85c93300748db7d1b","bindType":"ctWing","bindName":"ctWing","bindKey":"10f6c4b4d2e34f5b8b3422389544c81c"},{"id":"d224a06a6e64fc544ff5c15871023de1","bindType":"ctWing","bindName":"ctWing","bindKey":"d7d0214a5aa24174a743c42c0feae0dd"},{"id":"b9e90148c91e7e328149998e183a11c3","bindType":"ctWing","bindName":"ctWing","bindKey":"63c655137c7543f89c4fb3c242f5a3d9"},{"id":"c0b92add3f05c901ca79a9b9664c2890","bindType":"ctWing","bindName":"ctWing","bindKey":"a34a85abd4ac470fbc5451c73e7d2ff8"}]
         */

        @SerializedName("id")
        private String id;
        @SerializedName("name")
        private String name;
        @SerializedName("protocol")
        private String protocol;
        @SerializedName("protocolName")
        private String protocolName;
        @SerializedName("transport")
        private String transport;
        @SerializedName("productId")
        private String productId;
        @SerializedName("productName")
        private String productName;
        @SerializedName("deviceType")
        private DeviceType deviceType;
        @SerializedName("state")
        private State state;
        @SerializedName("address")
        private String address;
        @SerializedName("onlineTime")
        private Long onlineTime;
        @SerializedName("offlineTime")
        private Long offlineTime;
        @SerializedName("createTime")
        private Long createTime;
        @SerializedName("registerTime")
        private Long registerTime;
        @SerializedName("metadata")
        private String metadata;
        @SerializedName("configuration")
        private Configuration configuration;
        @SerializedName("cachedConfiguration")
        private CachedConfiguration cachedConfiguration;
        @SerializedName("aloneConfiguration")
        private Boolean aloneConfiguration;
        @SerializedName("parentId")
        private String parentId;
        @SerializedName("connectServerId")
        private String connectServerId;
        @SerializedName("tags")
        private List<Tags> tags;
        @SerializedName("binds")
        private List<Binds> binds;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public String getProtocolName() {
            return protocolName;
        }

        public void setProtocolName(String protocolName) {
            this.protocolName = protocolName;
        }

        public String getTransport() {
            return transport;
        }

        public void setTransport(String transport) {
            this.transport = transport;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public DeviceType getDeviceType() {
            return deviceType;
        }

        public void setDeviceType(DeviceType deviceType) {
            this.deviceType = deviceType;
        }

        public State getState() {
            return state;
        }

        public void setState(State state) {
            this.state = state;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Long getOnlineTime() {
            return onlineTime;
        }

        public void setOnlineTime(Long onlineTime) {
            this.onlineTime = onlineTime;
        }

        public Long getOfflineTime() {
            return offlineTime;
        }

        public void setOfflineTime(Long offlineTime) {
            this.offlineTime = offlineTime;
        }

        public Long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Long createTime) {
            this.createTime = createTime;
        }

        public Long getRegisterTime() {
            return registerTime;
        }

        public void setRegisterTime(Long registerTime) {
            this.registerTime = registerTime;
        }

        public String getMetadata() {
            return metadata;
        }

        public void setMetadata(String metadata) {
            this.metadata = metadata;
        }

        public Configuration getConfiguration() {
            return configuration;
        }

        public void setConfiguration(Configuration configuration) {
            this.configuration = configuration;
        }

        public CachedConfiguration getCachedConfiguration() {
            return cachedConfiguration;
        }

        public void setCachedConfiguration(CachedConfiguration cachedConfiguration) {
            this.cachedConfiguration = cachedConfiguration;
        }

        public Boolean getAloneConfiguration() {
            return aloneConfiguration;
        }

        public void setAloneConfiguration(Boolean aloneConfiguration) {
            this.aloneConfiguration = aloneConfiguration;
        }

        public String getParentId() {
            return parentId;
        }

        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        public String getConnectServerId() {
            return connectServerId;
        }

        public void setConnectServerId(String connectServerId) {
            this.connectServerId = connectServerId;
        }

        public List<Tags> getTags() {
            return tags;
        }

        public void setTags(List<Tags> tags) {
            this.tags = tags;
        }

        public List<Binds> getBinds() {
            return binds;
        }

        public void setBinds(List<Binds> binds) {
            this.binds = binds;
        }

        public static class DeviceType {
            /**
             * text : 直连设备
             * value : device
             */

            @SerializedName("text")
            private String text;
            @SerializedName("value")
            private String value;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            @Override
            public String toString() {
                return "DeviceType{" +
                        "text='" + text + '\'' +
                        ", value='" + value + '\'' +
                        '}';
            }
        }

        public static class State {
        }

        public static class Configuration {
        }

        public static class CachedConfiguration {
        }

        public static class Tags {
            /**
             * id : d4d4ef03c75da4353be4521b55deec50
             * key : location
             * name : 坐标
             * type : geoPoint
             * createTime : 1615779930156
             */

            @SerializedName("id")
            private String id;
            @SerializedName("key")
            private String key;
            @SerializedName("name")
            private String name;
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
                return "Tags{" +
                        "id='" + id + '\'' +
                        ", key='" + key + '\'' +
                        ", name='" + name + '\'' +
                        ", type='" + type + '\'' +
                        ", createTime=" + createTime +
                        '}';
            }
        }

        public static class Binds {
            /**
             * id : dbde486efd110c2fde66d7bb40f4f454
             * bindType : ctWing
             * bindName : ctWing
             * bindKey : 83ae556ea19a4d9f8cfc6399b916834b
             */

            @SerializedName("id")
            private String id;
            @SerializedName("bindType")
            private String bindType;
            @SerializedName("bindName")
            private String bindName;
            @SerializedName("bindKey")
            private String bindKey;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getBindType() {
                return bindType;
            }

            public void setBindType(String bindType) {
                this.bindType = bindType;
            }

            public String getBindName() {
                return bindName;
            }

            public void setBindName(String bindName) {
                this.bindName = bindName;
            }

            public String getBindKey() {
                return bindKey;
            }

            public void setBindKey(String bindKey) {
                this.bindKey = bindKey;
            }

            @Override
            public String toString() {
                return "Binds{" +
                        "id='" + id + '\'' +
                        ", bindType='" + bindType + '\'' +
                        ", bindName='" + bindName + '\'' +
                        ", bindKey='" + bindKey + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "Result{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", protocol='" + protocol + '\'' +
                    ", protocolName='" + protocolName + '\'' +
                    ", transport='" + transport + '\'' +
                    ", productId='" + productId + '\'' +
                    ", productName='" + productName + '\'' +
                    ", deviceType=" + deviceType +
                    ", state=" + state +
                    ", address='" + address + '\'' +
                    ", onlineTime=" + onlineTime +
                    ", offlineTime=" + offlineTime +
                    ", createTime=" + createTime +
                    ", registerTime=" + registerTime +
                    ", metadata='" + metadata + '\'' +
                    ", configuration=" + configuration +
                    ", cachedConfiguration=" + cachedConfiguration +
                    ", aloneConfiguration=" + aloneConfiguration +
                    ", parentId='" + parentId + '\'' +
                    ", connectServerId='" + connectServerId + '\'' +
                    ", tags=" + tags +
                    ", binds=" + binds +
                    '}';
        }
    }
}
