package com.jackpot.mess;

import java.util.List;

/**
 * @Author: hanjt
 * @Date: 2018/10/8 10:05
 * @Description:   使用插件GsonFormat将Json格式转换成object
 */
public class GsonFormatTest {

    /**
     * respCode : 00
     * respDesc : 成功
     * respData : [{"sub":[{"id":10061,"name":"全部用户","value":"user:user:view","path":"/bnhAdminAgent/commonsAgent","type":1,"level":1,"status":0,"category":"用户管理","seqNo":1301,"description":"账户查看","createTime":1511251961000,"createName":"admin","updateTime":1511251961000,"updateName":"admin","parentId":0,"menuPath":"page-customer-list","menuIcon":"icon-role_manage","productCode":null}],"icon":"icon-client","category":"用户管理"},{"sub":[{"id":10063,"name":"订单流水","value":"user:user:view","path":"/bnhAdminAgent/commonsAgent","type":1,"level":1,"status":0,"category":"交易管理","seqNo":1401,"description":"订单","createTime":1511604861000,"createName":"admin","updateTime":1511604861000,"updateName":"admin","parentId":0,"menuPath":"page-order-list","menuIcon":"icon-order","productCode":null},{"id":10065,"name":"放款","value":"user:user:view ","path":"/bnhAdminAgent/commonsAgent","type":1,"level":1,"status":0,"category":"交易管理","seqNo":1402,"description":"放款","createTime":1512549032000,"createName":"admin","updateTime":1516675279000,"updateName":"admin","parentId":0,"menuPath":"page-loan-list","menuIcon":"icon-order","productCode":null},{"id":10066,"name":"收款","value":"user:user:view","path":"/bnhAdminAgent/commonsAgent","type":1,"level":1,"status":0,"category":"交易管理","seqNo":1403,"description":"回款","createTime":1512549935000,"createName":"admin","updateTime":1516675392000,"updateName":"admin","parentId":0,"menuPath":"page-receivable-list","menuIcon":"icon-order","productCode":null},{"id":10100,"name":"我的审核订单","value":"user:user:myCheck","path":"/bnhAdminAgent/commonsAgent","type":1,"level":1,"status":0,"category":"交易管理","seqNo":14014,"description":"我的审核订单","createTime":1534410335000,"createName":"admin","updateTime":1535340875000,"updateName":"admin","parentId":0,"menuPath":"page-order-me","menuIcon":"","productCode":null}],"icon":"icon-transaction","category":"交易管理"},{"sub":[{"id":10074,"name":"催款订单","value":"user:urge:view","path":"/bnhAdminAgent/commonsAgent","type":1,"level":0,"status":0,"category":"催收管理","seqNo":1006,"description":"催款订单","createTime":1516947006000,"createName":"admin","updateTime":1516947183000,"updateName":"admin","parentId":0,"menuPath":"page-urgeOrder","menuIcon":"","productCode":null},{"id":10075,"name":"催收人员","value":"urge:user:view","path":"/bnhAdminAgent/commonsAgent","type":1,"level":1,"status":0,"category":"催收管理","seqNo":1007,"description":"催收人员","createTime":1516947328000,"createName":"admin","updateTime":1516947328000,"updateName":"admin","parentId":0,"menuPath":"page-urgeUser","menuIcon":"","productCode":null},{"id":10073,"name":"我的催收订单","value":"user:myurge:view","path":"/bnhAdminAgent/commonsAgent","type":1,"level":1,"status":0,"category":"催收管理","seqNo":1402,"description":"我的催收订单","createTime":1516074213000,"createName":"admin","updateTime":1536052918000,"updateName":"admin","parentId":0,"menuPath":"page-urgeUser-me","menuIcon":"","productCode":null}],"icon":"icon-collection","category":"催收管理"}]
     */

    private String respCode;
    private String respDesc;
    private List<RespDataBean> respData;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }

    public List<RespDataBean> getRespData() {
        return respData;
    }

    public void setRespData(List<RespDataBean> respData) {
        this.respData = respData;
    }

    public static class RespDataBean {
        /**
         * sub : [{"id":10061,"name":"全部用户","value":"user:user:view","path":"/bnhAdminAgent/commonsAgent","type":1,"level":1,"status":0,"category":"用户管理","seqNo":1301,"description":"账户查看","createTime":1511251961000,"createName":"admin","updateTime":1511251961000,"updateName":"admin","parentId":0,"menuPath":"page-customer-list","menuIcon":"icon-role_manage","productCode":null}]
         * icon : icon-client
         * category : 用户管理
         */

        private String icon;
        private String category;
        private List<SubBean> sub;

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public List<SubBean> getSub() {
            return sub;
        }

        public void setSub(List<SubBean> sub) {
            this.sub = sub;
        }

        public static class SubBean {
            /**
             * id : 10061
             * name : 全部用户
             * value : user:user:view
             * path : /bnhAdminAgent/commonsAgent
             * type : 1
             * level : 1
             * status : 0
             * category : 用户管理
             * seqNo : 1301
             * description : 账户查看
             * createTime : 1511251961000
             * createName : admin
             * updateTime : 1511251961000
             * updateName : admin
             * parentId : 0
             * menuPath : page-customer-list
             * menuIcon : icon-role_manage
             * productCode : null
             */

            private int id;
            private String name;
            private String value;
            private String path;
            private int type;
            private int level;
            private int status;
            private String category;
            private int seqNo;
            private String description;
            private long createTime;
            private String createName;
            private long updateTime;
            private String updateName;
            private int parentId;
            private String menuPath;
            private String menuIcon;
            private Object productCode;

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

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public int getSeqNo() {
                return seqNo;
            }

            public void setSeqNo(int seqNo) {
                this.seqNo = seqNo;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public String getCreateName() {
                return createName;
            }

            public void setCreateName(String createName) {
                this.createName = createName;
            }

            public long getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(long updateTime) {
                this.updateTime = updateTime;
            }

            public String getUpdateName() {
                return updateName;
            }

            public void setUpdateName(String updateName) {
                this.updateName = updateName;
            }

            public int getParentId() {
                return parentId;
            }

            public void setParentId(int parentId) {
                this.parentId = parentId;
            }

            public String getMenuPath() {
                return menuPath;
            }

            public void setMenuPath(String menuPath) {
                this.menuPath = menuPath;
            }

            public String getMenuIcon() {
                return menuIcon;
            }

            public void setMenuIcon(String menuIcon) {
                this.menuIcon = menuIcon;
            }

            public Object getProductCode() {
                return productCode;
            }

            public void setProductCode(Object productCode) {
                this.productCode = productCode;
            }
        }
    }
}
