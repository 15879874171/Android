package com.example.raspberry.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DeviceInstances {

    /**
     * result : {"pageIndex":0,"pageSize":10,"total":1083,"data":[{"id":"HBS-12xxx-10521CE4C9C7","name":"HBS-12-10521CE4C9C7","productId":"HBS-12","productName":"新界回水器","state":{"text":"离线","value":"offline"},"createTime":1610527202356,"registryTime":1610527202360},{"id":"HBS-12xxx-10521CE5806C","name":"HBS-12-10521CE5806C","productId":"HBS-12","productName":"新界回水器","state":{"text":"未启用","value":"notActive"},"createTime":1610348161114},{"id":"HBS-12xxx-10521CE587EA","name":"HBS-12-10521CE587EA","productId":"HBS-12","productName":"新界回水器","state":{"text":"未启用","value":"notActive"},"createTime":1611821011309},{"id":"HBS-12xxx-483FDA7D4A51","name":"HBS-12-483FDA7D4A51","productId":"HBS-12","productName":"新界回水器","state":{"text":"未启用","value":"notActive"},"createTime":1610349194789},{"id":"HBS-12xxx-483FDA07DBCD","name":"HBS-12-483FDA07DBCD","productId":"HBS-12","productName":"HBS-12","state":{"text":"在线","value":"online"},"createTime":1613530655545,"registryTime":1613530655605},{"id":"HBS-12xxx-10521CE588B6","name":"HBS-12-10521CE588B6","productId":"HBS-12","productName":"新界回水器","state":{"text":"未启用","value":"notActive"},"createTime":1610350398625},{"id":"HBS-12xxx-483FDA524AED","name":"HBS-12-483FDA524AED","productId":"HBS-12","productName":"新界回水器","state":{"text":"未启用","value":"notActive"},"createTime":1608164896181},{"id":"HBS-12xxx-483FDA528F4F","name":"HBS-12-483FDA528F4F","productId":"HBS-12","productName":"新界回水器","state":{"text":"未启用","value":"notActive"},"createTime":1608165251953},{"id":"HBS-12xxx-483FDA07EB5D","name":"HBS-12-483FDA07EB5D","productId":"HBS-12","productName":"HBS-12","state":{"text":"未启用","value":"notActive"},"createTime":1611816599386},{"id":"HBS-12xxx-10521CE335F2","name":"HBS-12-10521CE335F2","productId":"HBS-12","productName":"HBS-12","state":{"text":"未启用","value":"notActive"},"createTime":1611816999793}]}
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
         * pageIndex : 0
         * pageSize : 10
         * total : 1083
         * data : [{"id":"HBS-12xxx-10521CE4C9C7","name":"HBS-12-10521CE4C9C7","productId":"HBS-12","productName":"新界回水器","state":{"text":"离线","value":"offline"},"createTime":1610527202356,"registryTime":1610527202360},{"id":"HBS-12xxx-10521CE5806C","name":"HBS-12-10521CE5806C","productId":"HBS-12","productName":"新界回水器","state":{"text":"未启用","value":"notActive"},"createTime":1610348161114},{"id":"HBS-12xxx-10521CE587EA","name":"HBS-12-10521CE587EA","productId":"HBS-12","productName":"新界回水器","state":{"text":"未启用","value":"notActive"},"createTime":1611821011309},{"id":"HBS-12xxx-483FDA7D4A51","name":"HBS-12-483FDA7D4A51","productId":"HBS-12","productName":"新界回水器","state":{"text":"未启用","value":"notActive"},"createTime":1610349194789},{"id":"HBS-12xxx-483FDA07DBCD","name":"HBS-12-483FDA07DBCD","productId":"HBS-12","productName":"HBS-12","state":{"text":"在线","value":"online"},"createTime":1613530655545,"registryTime":1613530655605},{"id":"HBS-12xxx-10521CE588B6","name":"HBS-12-10521CE588B6","productId":"HBS-12","productName":"新界回水器","state":{"text":"未启用","value":"notActive"},"createTime":1610350398625},{"id":"HBS-12xxx-483FDA524AED","name":"HBS-12-483FDA524AED","productId":"HBS-12","productName":"新界回水器","state":{"text":"未启用","value":"notActive"},"createTime":1608164896181},{"id":"HBS-12xxx-483FDA528F4F","name":"HBS-12-483FDA528F4F","productId":"HBS-12","productName":"新界回水器","state":{"text":"未启用","value":"notActive"},"createTime":1608165251953},{"id":"HBS-12xxx-483FDA07EB5D","name":"HBS-12-483FDA07EB5D","productId":"HBS-12","productName":"HBS-12","state":{"text":"未启用","value":"notActive"},"createTime":1611816599386},{"id":"HBS-12xxx-10521CE335F2","name":"HBS-12-10521CE335F2","productId":"HBS-12","productName":"HBS-12","state":{"text":"未启用","value":"notActive"},"createTime":1611816999793}]
         */

        @SerializedName("pageIndex")
        private Integer pageIndex;
        @SerializedName("pageSize")
        private Integer pageSize;
        @SerializedName("total")
        private Integer total;
        @SerializedName("data")
        private List<Data> data;

        public Integer getPageIndex() {
            return pageIndex;
        }

        public void setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
        }

        public Integer getPageSize() {
            return pageSize;
        }

        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public List<Data> getData() {
            return data;
        }

        public void setData(List<Data> data) {
            this.data = data;
        }

        public static class Data {
            /**
             * id : HBS-12xxx-10521CE4C9C7
             * name : HBS-12-10521CE4C9C7
             * productId : HBS-12
             * productName : 新界回水器
             * state : {"text":"离线","value":"offline"}
             * createTime : 1610527202356
             * registryTime : 1610527202360
             */

            @SerializedName("id")
            private String id;
            @SerializedName("name")
            private String name;
            @SerializedName("productId")
            private String productId;
            @SerializedName("productName")
            private String productName;
            @SerializedName("state")
            private State state;
            @SerializedName("createTime")
            private Long createTime;
            @SerializedName("registryTime")
            private Long registryTime;

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

            public State getState() {
                return state;
            }

            public void setState(State state) {
                this.state = state;
            }

            public Long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(Long createTime) {
                this.createTime = createTime;
            }

            public Long getRegistryTime() {
                return registryTime;
            }

            public void setRegistryTime(Long registryTime) {
                this.registryTime = registryTime;
            }

            @Override
            public String toString() {
                return "Data{" +
                        "id='" + id + '\'' +
                        ", name='" + name + '\'' +
                        ", productId='" + productId + '\'' +
                        ", productName='" + productName + '\'' +
                        ", state=" + state +
                        ", createTime=" + createTime +
                        ", registryTime=" + registryTime +
                        '}';
            }

            public static class State {
                /**
                 * text : 离线
                 * value : offline
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
                    return "State{" +
                            "text='" + text + '\'' +
                            ", value='" + value + '\'' +
                            '}';
                }
            }
        }
    }
}
