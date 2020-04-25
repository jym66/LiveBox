package com.EncryptBean;

import java.util.List;

public class DouyuEncryptBean {

    /**
     * error : 0
     * msg : ok
     * data : {"rtmp_cdn":"ws","cdns":["ws","tct"],"cdnsWithName":[{"name":"主线路","cdn":"ws"},{"name":"备用线路5","cdn":"tct"}],"mixed_url":"","mixedCDN":"","streamStatus":1,"rtmp_url":"http://183.131.124.62/hdla.douyucdn.cn/live","rtmp_live":"911rsaobai_550p.flv?wsAuth=4cf4f689e70c76b1bc88ebf362b82439&token=app-androidhd1-0-911-03fe28aa7557abf3d0a8c117a00456ccb6d037cc08d529aa&logo=0&expire=0&did=99c89f52-f131-4ff3-8546-1867e2978fb9&ver=v1.2.1&pt=1&st=0&origin=all&mix=0&isp=","room_id":911,"owner_uid":51234,"player_1":"","clientIP":"113.122.225.209","rateSwitch":1,"rateSetting":[{"name":"蓝光8M","rate":0,"highBit":1},{"name":"蓝光4M","rate":4,"highBit":1},{"name":"超清","rate":3,"highBit":0},{"name":"高清","rate":2,"highBit":0},{"name":"流畅","rate":1,"highBit":0}],"hightBit":0,"is_pass_player":0,"eticket":[],"rate":1,"hls_url":"","p2p":0,"streamType":0,"smt":0,"p2pext":0,"p2pCid":0,"p2pCids":"","p2pMeta":null}
     */

    private int error;
    private String msg;
    private DataBean data;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * rtmp_cdn : ws
         * cdns : ["ws","tct"]
         * cdnsWithName : [{"name":"主线路","cdn":"ws"},{"name":"备用线路5","cdn":"tct"}]
         * mixed_url :
         * mixedCDN :
         * streamStatus : 1
         * rtmp_url : http://183.131.124.62/hdla.douyucdn.cn/live
         * rtmp_live : 911rsaobai_550p.flv?wsAuth=4cf4f689e70c76b1bc88ebf362b82439&token=app-androidhd1-0-911-03fe28aa7557abf3d0a8c117a00456ccb6d037cc08d529aa&logo=0&expire=0&did=99c89f52-f131-4ff3-8546-1867e2978fb9&ver=v1.2.1&pt=1&st=0&origin=all&mix=0&isp=
         * room_id : 911
         * owner_uid : 51234
         * player_1 :
         * clientIP : 113.122.225.209
         * rateSwitch : 1
         * rateSetting : [{"name":"蓝光8M","rate":0,"highBit":1},{"name":"蓝光4M","rate":4,"highBit":1},{"name":"超清","rate":3,"highBit":0},{"name":"高清","rate":2,"highBit":0},{"name":"流畅","rate":1,"highBit":0}]
         * hightBit : 0
         * is_pass_player : 0
         * eticket : []
         * rate : 1
         * hls_url :
         * p2p : 0
         * streamType : 0
         * smt : 0
         * p2pext : 0
         * p2pCid : 0
         * p2pCids :
         * p2pMeta : null
         */

        private String rtmp_cdn;
        private String mixed_url;
        private String mixedCDN;
        private int streamStatus;
        private String rtmp_url;
        private String rtmp_live;
        private int room_id;
        private int owner_uid;
        private String player_1;
        private String clientIP;
        private int rateSwitch;
        private int hightBit;
        private int is_pass_player;
        private int rate;
        private String hls_url;
        private int p2p;
        private int streamType;
        private int smt;
        private int p2pext;
        private int p2pCid;
        private String p2pCids;
        private Object p2pMeta;
        private List<String> cdns;
        private List<CdnsWithNameBean> cdnsWithName;
        private List<RateSettingBean> rateSetting;
        private List<?> eticket;

        public String getRtmp_cdn() {
            return rtmp_cdn;
        }

        public void setRtmp_cdn(String rtmp_cdn) {
            this.rtmp_cdn = rtmp_cdn;
        }

        public String getMixed_url() {
            return mixed_url;
        }

        public void setMixed_url(String mixed_url) {
            this.mixed_url = mixed_url;
        }

        public String getMixedCDN() {
            return mixedCDN;
        }

        public void setMixedCDN(String mixedCDN) {
            this.mixedCDN = mixedCDN;
        }

        public int getStreamStatus() {
            return streamStatus;
        }

        public void setStreamStatus(int streamStatus) {
            this.streamStatus = streamStatus;
        }

        public String getRtmp_url() {
            return rtmp_url;
        }

        public void setRtmp_url(String rtmp_url) {
            this.rtmp_url = rtmp_url;
        }

        public String getRtmp_live() {
            return rtmp_live;
        }

        public void setRtmp_live(String rtmp_live) {
            this.rtmp_live = rtmp_live;
        }

        public int getRoom_id() {
            return room_id;
        }

        public void setRoom_id(int room_id) {
            this.room_id = room_id;
        }

        public int getOwner_uid() {
            return owner_uid;
        }

        public void setOwner_uid(int owner_uid) {
            this.owner_uid = owner_uid;
        }

        public String getPlayer_1() {
            return player_1;
        }

        public void setPlayer_1(String player_1) {
            this.player_1 = player_1;
        }

        public String getClientIP() {
            return clientIP;
        }

        public void setClientIP(String clientIP) {
            this.clientIP = clientIP;
        }

        public int getRateSwitch() {
            return rateSwitch;
        }

        public void setRateSwitch(int rateSwitch) {
            this.rateSwitch = rateSwitch;
        }

        public int getHightBit() {
            return hightBit;
        }

        public void setHightBit(int hightBit) {
            this.hightBit = hightBit;
        }

        public int getIs_pass_player() {
            return is_pass_player;
        }

        public void setIs_pass_player(int is_pass_player) {
            this.is_pass_player = is_pass_player;
        }

        public int getRate() {
            return rate;
        }

        public void setRate(int rate) {
            this.rate = rate;
        }

        public String getHls_url() {
            return hls_url;
        }

        public void setHls_url(String hls_url) {
            this.hls_url = hls_url;
        }

        public int getP2p() {
            return p2p;
        }

        public void setP2p(int p2p) {
            this.p2p = p2p;
        }

        public int getStreamType() {
            return streamType;
        }

        public void setStreamType(int streamType) {
            this.streamType = streamType;
        }

        public int getSmt() {
            return smt;
        }

        public void setSmt(int smt) {
            this.smt = smt;
        }

        public int getP2pext() {
            return p2pext;
        }

        public void setP2pext(int p2pext) {
            this.p2pext = p2pext;
        }

        public int getP2pCid() {
            return p2pCid;
        }

        public void setP2pCid(int p2pCid) {
            this.p2pCid = p2pCid;
        }

        public String getP2pCids() {
            return p2pCids;
        }

        public void setP2pCids(String p2pCids) {
            this.p2pCids = p2pCids;
        }

        public Object getP2pMeta() {
            return p2pMeta;
        }

        public void setP2pMeta(Object p2pMeta) {
            this.p2pMeta = p2pMeta;
        }

        public List<String> getCdns() {
            return cdns;
        }

        public void setCdns(List<String> cdns) {
            this.cdns = cdns;
        }

        public List<CdnsWithNameBean> getCdnsWithName() {
            return cdnsWithName;
        }

        public void setCdnsWithName(List<CdnsWithNameBean> cdnsWithName) {
            this.cdnsWithName = cdnsWithName;
        }

        public List<RateSettingBean> getRateSetting() {
            return rateSetting;
        }

        public void setRateSetting(List<RateSettingBean> rateSetting) {
            this.rateSetting = rateSetting;
        }

        public List<?> getEticket() {
            return eticket;
        }

        public void setEticket(List<?> eticket) {
            this.eticket = eticket;
        }

        public static class CdnsWithNameBean {
            /**
             * name : 主线路
             * cdn : ws
             */

            private String name;
            private String cdn;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCdn() {
                return cdn;
            }

            public void setCdn(String cdn) {
                this.cdn = cdn;
            }
        }

        public static class RateSettingBean {
            /**
             * name : 蓝光8M
             * rate : 0
             * highBit : 1
             */

            private String name;
            private int rate;
            private int highBit;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getRate() {
                return rate;
            }

            public void setRate(int rate) {
                this.rate = rate;
            }

            public int getHighBit() {
                return highBit;
            }

            public void setHighBit(int highBit) {
                this.highBit = highBit;
            }
        }
    }
}
