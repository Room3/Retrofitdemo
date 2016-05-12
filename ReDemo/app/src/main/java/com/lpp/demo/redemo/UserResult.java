package com.lpp.demo.redemo;

import java.io.Serializable;

/**
 * Created by user on 2016/3/23.
 */
public class UserResult implements Serializable {
    private String result;
    private User pd;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public User getUser() {
        return pd;
    }

    public void setPd(User pd) {
        this.pd = pd;
    }

    public class User implements Serializable{
        private String EMALL;
        private String NAME;
        private String NUMBER;
        private String PASSWORD;
        private String PHONE;
        private String STATUS;
        private String USERNAME;
        private String USER_ID;
        private String YEARS;
        private String IMG_URL_SMALL;

        public String getIMG_URL_SMALL() {
            return IMG_URL_SMALL;
        }

        public void setIMG_URL_SMALL(String IMG_URL_SMALL) {
            this.IMG_URL_SMALL = IMG_URL_SMALL;
        }

        public String getEMALL() {
            return EMALL;
        }

        public void setEMALL(String EMALL) {
            this.EMALL = EMALL;
        }

        public String getNAME() {
            return NAME;
        }

        public void setNAME(String NAME) {
            this.NAME = NAME;
        }

        public String getNUMBER() {
            return NUMBER;
        }

        public void setNUMBER(String NUMBER) {
            this.NUMBER = NUMBER;
        }

        public String getPASSWORD() {
            return PASSWORD;
        }

        public void setPASSWORD(String PASSWORD) {
            this.PASSWORD = PASSWORD;
        }

        public String getPHONE() {
            return PHONE;
        }

        public void setPHONE(String PHONE) {
            this.PHONE = PHONE;
        }

        public String getSTATUS() {
            return STATUS;
        }

        public void setSTATUS(String STATUS) {
            this.STATUS = STATUS;
        }

        public String getUSERNAME() {
            return USERNAME;
        }

        public void setUSERNAME(String USERNAME) {
            this.USERNAME = USERNAME;
        }

        public String getUSER_ID() {
            return USER_ID;
        }

        public void setUSER_ID(String USER_ID) {
            this.USER_ID = USER_ID;
        }

        public String getYEARS() {
            return YEARS;
        }

        public void setYEARS(String YEARS) {
            this.YEARS = YEARS;
        }

        @Override
        public String toString() {
            return "User{" +
                    "EMALL='" + EMALL + '\'' +
                    ", NAME='" + NAME + '\'' +
                    ", NUMBER='" + NUMBER + '\'' +
                    ", PASSWORD='" + PASSWORD + '\'' +
                    ", PHONE='" + PHONE + '\'' +
                    ", STATUS='" + STATUS + '\'' +
                    ", USERNAME='" + USERNAME + '\'' +
                    ", USER_ID='" + USER_ID + '\'' +
                    ", YEARS='" + YEARS + '\'' +
                    ", IMG_URL_SMALL='" + IMG_URL_SMALL + '\'' +
                    '}';
        }
    }
}
