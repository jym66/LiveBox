package com.EncryptBean;

import java.util.List;

public class BibiliEncryBean {
    /**
     * code : 0
     * message : 0
     * ttl : 1
     * data : {"current_quality":4,"accept_quality":["4"],"current_qn":10000,"quality_description":[{"qn":10000,"desc":"原画"}],"durl":[{"url":"http://d1--cn-gotcha04.bilivideo.com/live-bvc/351128/live_327621460_9069014.flv?cdn=cn-gotcha04&expires=1586929897&len=0&oi=2419365783&pt=android&qn=10000&trid=e457d9d803ec4479b29659eab0f146e7&sigparams=cdn,expires,len,oi,pt,qn,trid&sign=931f6d9ae79321881ca01942d6b16bf1&ptype=0","length":0,"order":1,"stream_type":0},{"url":"http://d1--cn-gotcha04.bilivideo.com/live-bvc/119080/live_327621460_9069014.flv?cdn=cn-gotcha04&expires=1586929897&len=0&oi=2419365783&pt=android&qn=10000&trid=e457d9d803ec4479b29659eab0f146e7&sigparams=cdn,expires,len,oi,pt,qn,trid&sign=b7946e9ef70f97f566a5c32523debe8e&ptype=0","length":0,"order":1,"stream_type":0},{"url":"http://d1--cn-gotcha04.bilivideo.com/live-bvc/611206/live_327621460_9069014.flv?cdn=cn-gotcha04&expires=1586929897&len=0&oi=2419365783&pt=android&qn=10000&trid=e457d9d803ec4479b29659eab0f146e7&sigparams=cdn,expires,len,oi,pt,qn,trid&sign=c42e04bd804f95bfee1383a848ef4fe7&ptype=0","length":0,"order":1,"stream_type":0},{"url":"http://d1--cn-gotcha04.bilivideo.com/live-bvc/173508/live_327621460_9069014.flv?cdn=cn-gotcha04&expires=1586929897&len=0&oi=2419365783&pt=android&qn=10000&trid=e457d9d803ec4479b29659eab0f146e7&sigparams=cdn,expires,len,oi,pt,qn,trid&sign=771764c7e93e506a83db23785862e013&ptype=0","length":0,"order":1,"stream_type":0}]}
     */

    private int code;
    private String message;
    private int ttl;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * current_quality : 4
         * accept_quality : ["4"]
         * current_qn : 10000
         * quality_description : [{"qn":10000,"desc":"原画"}]
         * durl : [{"url":"http://d1--cn-gotcha04.bilivideo.com/live-bvc/351128/live_327621460_9069014.flv?cdn=cn-gotcha04&expires=1586929897&len=0&oi=2419365783&pt=android&qn=10000&trid=e457d9d803ec4479b29659eab0f146e7&sigparams=cdn,expires,len,oi,pt,qn,trid&sign=931f6d9ae79321881ca01942d6b16bf1&ptype=0","length":0,"order":1,"stream_type":0},{"url":"http://d1--cn-gotcha04.bilivideo.com/live-bvc/119080/live_327621460_9069014.flv?cdn=cn-gotcha04&expires=1586929897&len=0&oi=2419365783&pt=android&qn=10000&trid=e457d9d803ec4479b29659eab0f146e7&sigparams=cdn,expires,len,oi,pt,qn,trid&sign=b7946e9ef70f97f566a5c32523debe8e&ptype=0","length":0,"order":1,"stream_type":0},{"url":"http://d1--cn-gotcha04.bilivideo.com/live-bvc/611206/live_327621460_9069014.flv?cdn=cn-gotcha04&expires=1586929897&len=0&oi=2419365783&pt=android&qn=10000&trid=e457d9d803ec4479b29659eab0f146e7&sigparams=cdn,expires,len,oi,pt,qn,trid&sign=c42e04bd804f95bfee1383a848ef4fe7&ptype=0","length":0,"order":1,"stream_type":0},{"url":"http://d1--cn-gotcha04.bilivideo.com/live-bvc/173508/live_327621460_9069014.flv?cdn=cn-gotcha04&expires=1586929897&len=0&oi=2419365783&pt=android&qn=10000&trid=e457d9d803ec4479b29659eab0f146e7&sigparams=cdn,expires,len,oi,pt,qn,trid&sign=771764c7e93e506a83db23785862e013&ptype=0","length":0,"order":1,"stream_type":0}]
         */

        private int current_quality;
        private int current_qn;
        private List<String> accept_quality;
        private List<QualityDescriptionBean> quality_description;
        private List<DurlBean> durl;

        public int getCurrent_quality() {
            return current_quality;
        }

        public void setCurrent_quality(int current_quality) {
            this.current_quality = current_quality;
        }

        public int getCurrent_qn() {
            return current_qn;
        }

        public void setCurrent_qn(int current_qn) {
            this.current_qn = current_qn;
        }

        public List<String> getAccept_quality() {
            return accept_quality;
        }

        public void setAccept_quality(List<String> accept_quality) {
            this.accept_quality = accept_quality;
        }

        public List<QualityDescriptionBean> getQuality_description() {
            return quality_description;
        }

        public void setQuality_description(List<QualityDescriptionBean> quality_description) {
            this.quality_description = quality_description;
        }

        public List<DurlBean> getDurl() {
            return durl;
        }

        public void setDurl(List<DurlBean> durl) {
            this.durl = durl;
        }

        public static class QualityDescriptionBean {
            /**
             * qn : 10000
             * desc : 原画
             */

            private int qn;
            private String desc;

            public int getQn() {
                return qn;
            }

            public void setQn(int qn) {
                this.qn = qn;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }
        }

        public static class DurlBean {
            /**
             * url : http://d1--cn-gotcha04.bilivideo.com/live-bvc/351128/live_327621460_9069014.flv?cdn=cn-gotcha04&expires=1586929897&len=0&oi=2419365783&pt=android&qn=10000&trid=e457d9d803ec4479b29659eab0f146e7&sigparams=cdn,expires,len,oi,pt,qn,trid&sign=931f6d9ae79321881ca01942d6b16bf1&ptype=0
             * length : 0
             * order : 1
             * stream_type : 0
             */

            private String url;
            private int length;
            private int order;
            private int stream_type;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getLength() {
                return length;
            }

            public void setLength(int length) {
                this.length = length;
            }

            public int getOrder() {
                return order;
            }

            public void setOrder(int order) {
                this.order = order;
            }

            public int getStream_type() {
                return stream_type;
            }

            public void setStream_type(int stream_type) {
                this.stream_type = stream_type;
            }
        }
    }
}
