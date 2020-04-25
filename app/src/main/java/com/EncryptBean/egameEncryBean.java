package com.EncryptBean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class egameEncryBean {

    /**
     * uid : 206600472
     * ecode : 0
     * data : {"0":{"module":"pgg_live_read_svr","method":"get_live_and_profile_info","retMsg":"成功","retCode":0,"retBody":{"data":{"video_info":{"pid":"383204988_1587083395","vid":"","channel_id":"3954_383204988","url":"http://shp.qpic.cn/pggamehead/0/1585661177_445_750x400/0","video_type":1,"tag":"专区小时榜主","title":"我是北美：早上好！","appid":"lol","appname":"英雄联盟","anchor_id":383204988,"start_tm":1587083395,"end_tm":0,"provider":2,"stream_infos":[{"bitrate":0,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988.flv?bizid=3954&txSecret=38ec71d0cd0801b1ae6a04637d7e636e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjOH6UwDmsWjiGxkMUvlaVat6fl2QLbMYwQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRE0tejNkYzZNRkFEOEFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTG8xgDWAOzwDwQ%3D","desc":"蓝光8M","h265_play_url":"","level_type":8,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=0&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":1080,"width":1920},{"bitrate":4000,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988_4000.flv?bizid=3954&txSecret=d5d745b42c391f884c340835e04fa404&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhgQQXDx2on6GqFsv3k9uj0eFHRRKCNiRSgQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBQXpfRDNkYzZNRkFFQUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxD6DGANYA7PAPBA%3D%3D","desc":"蓝光4M","h265_play_url":"http://flv265-3954.liveplay.myqcloud.com/live/3954_383204988_4000.flv?bizid=3954&txSecret=d5d745b42c391f884c340835e04fa404&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjPcXPpVrkIJDaJ6uTr1G%2B7lLw3GrSX%2B6cQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBQnNfRDNkYzZNRkFFRUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxD6DGANYA7PAPBA%3D%3D","level_type":4,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=2000&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":0,"width":0},{"bitrate":1200,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988_1200.flv?bizid=3954&txSecret=848676262c17d688091974917eeece4e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjpJE2HyKs7rBXFsrzQIVBzHeQPaKsdhWcQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBQ2FfRDNkYzZNRkFFSUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxBLDGANYA7PAPBA%3D%3D","desc":"高清","h265_play_url":"http://flv265-3954.liveplay.myqcloud.com/live/3954_383204988_1200.flv?bizid=3954&txSecret=848676262c17d688091974917eeece4e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhiuU%2B2os5A7mJRsHqlKnwYhPKKLofhjgtsQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRERfRDNkYzZNRkFFTUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxBLDGANYA7PAPBA%3D%3D","level_type":2,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=1200&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":0,"width":0},{"bitrate":500,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988_500.flv?bizid=3954&txSecret=f7c16cb075caff1fea96c61170bc713b&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjMWbu3M8tVMQYNa7nzV33fGuHZIRCECb8QASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRDFfRDNkYzZNRkFFUUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxAfTGANYA7PAPBA%3D%3D","desc":"流畅","h265_play_url":"","level_type":1,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=1200&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":0,"width":0}],"v_attr":{"source":"egame_obs","hv_direction":1,"v_cache_tm_max":4,"v_cache_tm_min":4,"dual_id":199,"dual_type":2,"v_play_mode":3,"v_width":1920,"v_height":1080},"game_icon":"http://shp.qpic.cn/pggamehead/0/1508764619_773_100x100/0?new=1.0&w=100&h=100","player_type":2,"use_p2p":false,"p2p_v_attr":{"v_cache_tm_max":0,"v_cache_tm_min":0,"v_play_mode":0,"conf_data":""},"unlogin_highest_level":0,"level_type":0},"profile_info":{"nick_name":"小智","face_url":"http://shp.qlogo.cn/pghead/PiajxSqBRaEJWFec9icZFDz1N8vCzibF6CNfCBs1Hia6MjA/140","max_face_size":640,"face_update_ts":1585910140,"sex":1,"city":"葫芦岛","province":"辽宁","country":"中国","register_ts":1509649994,"login_type":1,"role":1,"brief":"抖音号：cjxiaozhi2333 微视号：xiaozhi2333。欢迎大家关注！","poster_url":"http://shp.qlogo.cn/pghead/PiajxSqBRaEJWFec9icZFDz1N8vCzibF6CNfCBs1Hia6MjA/0","is_live":1,"fans_count":2468302,"video_count":647,"user_priv":{"priv_base":{"level":14,"level_pic":"http://imgcache.qq.com/club/mobile/qgame/images/level/level_14_min.png"},"used_medals":[],"noble_info":{"level":0,"u_sh":""},"priv_base_new":{"level":35,"level_pic":""}},"uid":383204988,"alias_id":2333},"h5_url":"http://shp.qpic.cn/pggamehead/0/1541644500_883_690x72/0?new=1.0&w=690&h=72","pay_info":{"play_info":{"live_pay_type":0,"free_watch_time":0,"status":0,"match_info":{"match_name":"","player_name":"","match_id":"","player_id":""},"support_platform":[],"pay_live":0},"buy_info":{"fee":0,"ticket_gift_ids":[]}}},"message":"成功","result":0,"svr_time":1587092912,"time_cost":64}}}
     * login_cost : 23
     * time_cost : 91
     */

    private int uid;
    private int ecode;
    private DataBeanX data;
    private int login_cost;
    private int time_cost;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getEcode() {
        return ecode;
    }

    public void setEcode(int ecode) {
        this.ecode = ecode;
    }

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public int getLogin_cost() {
        return login_cost;
    }

    public void setLogin_cost(int login_cost) {
        this.login_cost = login_cost;
    }

    public int getTime_cost() {
        return time_cost;
    }

    public void setTime_cost(int time_cost) {
        this.time_cost = time_cost;
    }

    public static class DataBeanX {
        /**
         * 0 : {"module":"pgg_live_read_svr","method":"get_live_and_profile_info","retMsg":"成功","retCode":0,"retBody":{"data":{"video_info":{"pid":"383204988_1587083395","vid":"","channel_id":"3954_383204988","url":"http://shp.qpic.cn/pggamehead/0/1585661177_445_750x400/0","video_type":1,"tag":"专区小时榜主","title":"我是北美：早上好！","appid":"lol","appname":"英雄联盟","anchor_id":383204988,"start_tm":1587083395,"end_tm":0,"provider":2,"stream_infos":[{"bitrate":0,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988.flv?bizid=3954&txSecret=38ec71d0cd0801b1ae6a04637d7e636e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjOH6UwDmsWjiGxkMUvlaVat6fl2QLbMYwQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRE0tejNkYzZNRkFEOEFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTG8xgDWAOzwDwQ%3D","desc":"蓝光8M","h265_play_url":"","level_type":8,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=0&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":1080,"width":1920},{"bitrate":4000,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988_4000.flv?bizid=3954&txSecret=d5d745b42c391f884c340835e04fa404&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhgQQXDx2on6GqFsv3k9uj0eFHRRKCNiRSgQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBQXpfRDNkYzZNRkFFQUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxD6DGANYA7PAPBA%3D%3D","desc":"蓝光4M","h265_play_url":"http://flv265-3954.liveplay.myqcloud.com/live/3954_383204988_4000.flv?bizid=3954&txSecret=d5d745b42c391f884c340835e04fa404&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjPcXPpVrkIJDaJ6uTr1G%2B7lLw3GrSX%2B6cQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBQnNfRDNkYzZNRkFFRUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxD6DGANYA7PAPBA%3D%3D","level_type":4,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=2000&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":0,"width":0},{"bitrate":1200,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988_1200.flv?bizid=3954&txSecret=848676262c17d688091974917eeece4e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjpJE2HyKs7rBXFsrzQIVBzHeQPaKsdhWcQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBQ2FfRDNkYzZNRkFFSUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxBLDGANYA7PAPBA%3D%3D","desc":"高清","h265_play_url":"http://flv265-3954.liveplay.myqcloud.com/live/3954_383204988_1200.flv?bizid=3954&txSecret=848676262c17d688091974917eeece4e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhiuU%2B2os5A7mJRsHqlKnwYhPKKLofhjgtsQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRERfRDNkYzZNRkFFTUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxBLDGANYA7PAPBA%3D%3D","level_type":2,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=1200&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":0,"width":0},{"bitrate":500,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988_500.flv?bizid=3954&txSecret=f7c16cb075caff1fea96c61170bc713b&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjMWbu3M8tVMQYNa7nzV33fGuHZIRCECb8QASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRDFfRDNkYzZNRkFFUUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxAfTGANYA7PAPBA%3D%3D","desc":"流畅","h265_play_url":"","level_type":1,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=1200&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":0,"width":0}],"v_attr":{"source":"egame_obs","hv_direction":1,"v_cache_tm_max":4,"v_cache_tm_min":4,"dual_id":199,"dual_type":2,"v_play_mode":3,"v_width":1920,"v_height":1080},"game_icon":"http://shp.qpic.cn/pggamehead/0/1508764619_773_100x100/0?new=1.0&w=100&h=100","player_type":2,"use_p2p":false,"p2p_v_attr":{"v_cache_tm_max":0,"v_cache_tm_min":0,"v_play_mode":0,"conf_data":""},"unlogin_highest_level":0,"level_type":0},"profile_info":{"nick_name":"小智","face_url":"http://shp.qlogo.cn/pghead/PiajxSqBRaEJWFec9icZFDz1N8vCzibF6CNfCBs1Hia6MjA/140","max_face_size":640,"face_update_ts":1585910140,"sex":1,"city":"葫芦岛","province":"辽宁","country":"中国","register_ts":1509649994,"login_type":1,"role":1,"brief":"抖音号：cjxiaozhi2333 微视号：xiaozhi2333。欢迎大家关注！","poster_url":"http://shp.qlogo.cn/pghead/PiajxSqBRaEJWFec9icZFDz1N8vCzibF6CNfCBs1Hia6MjA/0","is_live":1,"fans_count":2468302,"video_count":647,"user_priv":{"priv_base":{"level":14,"level_pic":"http://imgcache.qq.com/club/mobile/qgame/images/level/level_14_min.png"},"used_medals":[],"noble_info":{"level":0,"u_sh":""},"priv_base_new":{"level":35,"level_pic":""}},"uid":383204988,"alias_id":2333},"h5_url":"http://shp.qpic.cn/pggamehead/0/1541644500_883_690x72/0?new=1.0&w=690&h=72","pay_info":{"play_info":{"live_pay_type":0,"free_watch_time":0,"status":0,"match_info":{"match_name":"","player_name":"","match_id":"","player_id":""},"support_platform":[],"pay_live":0},"buy_info":{"fee":0,"ticket_gift_ids":[]}}},"message":"成功","result":0,"svr_time":1587092912,"time_cost":64}}
         */

        @SerializedName("0")
        private _$0Bean _$0;

        public _$0Bean get_$0() {
            return _$0;
        }

        public void set_$0(_$0Bean _$0) {
            this._$0 = _$0;
        }

        public static class _$0Bean {
            /**
             * module : pgg_live_read_svr
             * method : get_live_and_profile_info
             * retMsg : 成功
             * retCode : 0
             * retBody : {"data":{"video_info":{"pid":"383204988_1587083395","vid":"","channel_id":"3954_383204988","url":"http://shp.qpic.cn/pggamehead/0/1585661177_445_750x400/0","video_type":1,"tag":"专区小时榜主","title":"我是北美：早上好！","appid":"lol","appname":"英雄联盟","anchor_id":383204988,"start_tm":1587083395,"end_tm":0,"provider":2,"stream_infos":[{"bitrate":0,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988.flv?bizid=3954&txSecret=38ec71d0cd0801b1ae6a04637d7e636e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjOH6UwDmsWjiGxkMUvlaVat6fl2QLbMYwQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRE0tejNkYzZNRkFEOEFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTG8xgDWAOzwDwQ%3D","desc":"蓝光8M","h265_play_url":"","level_type":8,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=0&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":1080,"width":1920},{"bitrate":4000,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988_4000.flv?bizid=3954&txSecret=d5d745b42c391f884c340835e04fa404&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhgQQXDx2on6GqFsv3k9uj0eFHRRKCNiRSgQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBQXpfRDNkYzZNRkFFQUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxD6DGANYA7PAPBA%3D%3D","desc":"蓝光4M","h265_play_url":"http://flv265-3954.liveplay.myqcloud.com/live/3954_383204988_4000.flv?bizid=3954&txSecret=d5d745b42c391f884c340835e04fa404&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjPcXPpVrkIJDaJ6uTr1G%2B7lLw3GrSX%2B6cQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBQnNfRDNkYzZNRkFFRUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxD6DGANYA7PAPBA%3D%3D","level_type":4,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=2000&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":0,"width":0},{"bitrate":1200,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988_1200.flv?bizid=3954&txSecret=848676262c17d688091974917eeece4e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjpJE2HyKs7rBXFsrzQIVBzHeQPaKsdhWcQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBQ2FfRDNkYzZNRkFFSUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxBLDGANYA7PAPBA%3D%3D","desc":"高清","h265_play_url":"http://flv265-3954.liveplay.myqcloud.com/live/3954_383204988_1200.flv?bizid=3954&txSecret=848676262c17d688091974917eeece4e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhiuU%2B2os5A7mJRsHqlKnwYhPKKLofhjgtsQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRERfRDNkYzZNRkFFTUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxBLDGANYA7PAPBA%3D%3D","level_type":2,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=1200&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":0,"width":0},{"bitrate":500,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988_500.flv?bizid=3954&txSecret=f7c16cb075caff1fea96c61170bc713b&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjMWbu3M8tVMQYNa7nzV33fGuHZIRCECb8QASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRDFfRDNkYzZNRkFFUUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxAfTGANYA7PAPBA%3D%3D","desc":"流畅","h265_play_url":"","level_type":1,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=1200&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":0,"width":0}],"v_attr":{"source":"egame_obs","hv_direction":1,"v_cache_tm_max":4,"v_cache_tm_min":4,"dual_id":199,"dual_type":2,"v_play_mode":3,"v_width":1920,"v_height":1080},"game_icon":"http://shp.qpic.cn/pggamehead/0/1508764619_773_100x100/0?new=1.0&w=100&h=100","player_type":2,"use_p2p":false,"p2p_v_attr":{"v_cache_tm_max":0,"v_cache_tm_min":0,"v_play_mode":0,"conf_data":""},"unlogin_highest_level":0,"level_type":0},"profile_info":{"nick_name":"小智","face_url":"http://shp.qlogo.cn/pghead/PiajxSqBRaEJWFec9icZFDz1N8vCzibF6CNfCBs1Hia6MjA/140","max_face_size":640,"face_update_ts":1585910140,"sex":1,"city":"葫芦岛","province":"辽宁","country":"中国","register_ts":1509649994,"login_type":1,"role":1,"brief":"抖音号：cjxiaozhi2333 微视号：xiaozhi2333。欢迎大家关注！","poster_url":"http://shp.qlogo.cn/pghead/PiajxSqBRaEJWFec9icZFDz1N8vCzibF6CNfCBs1Hia6MjA/0","is_live":1,"fans_count":2468302,"video_count":647,"user_priv":{"priv_base":{"level":14,"level_pic":"http://imgcache.qq.com/club/mobile/qgame/images/level/level_14_min.png"},"used_medals":[],"noble_info":{"level":0,"u_sh":""},"priv_base_new":{"level":35,"level_pic":""}},"uid":383204988,"alias_id":2333},"h5_url":"http://shp.qpic.cn/pggamehead/0/1541644500_883_690x72/0?new=1.0&w=690&h=72","pay_info":{"play_info":{"live_pay_type":0,"free_watch_time":0,"status":0,"match_info":{"match_name":"","player_name":"","match_id":"","player_id":""},"support_platform":[],"pay_live":0},"buy_info":{"fee":0,"ticket_gift_ids":[]}}},"message":"成功","result":0,"svr_time":1587092912,"time_cost":64}
             */

            private String module;
            private String method;
            private String retMsg;
            private int retCode;
            private RetBodyBean retBody;

            public String getModule() {
                return module;
            }

            public void setModule(String module) {
                this.module = module;
            }

            public String getMethod() {
                return method;
            }

            public void setMethod(String method) {
                this.method = method;
            }

            public String getRetMsg() {
                return retMsg;
            }

            public void setRetMsg(String retMsg) {
                this.retMsg = retMsg;
            }

            public int getRetCode() {
                return retCode;
            }

            public void setRetCode(int retCode) {
                this.retCode = retCode;
            }

            public RetBodyBean getRetBody() {
                return retBody;
            }

            public void setRetBody(RetBodyBean retBody) {
                this.retBody = retBody;
            }

            public static class RetBodyBean {
                /**
                 * data : {"video_info":{"pid":"383204988_1587083395","vid":"","channel_id":"3954_383204988","url":"http://shp.qpic.cn/pggamehead/0/1585661177_445_750x400/0","video_type":1,"tag":"专区小时榜主","title":"我是北美：早上好！","appid":"lol","appname":"英雄联盟","anchor_id":383204988,"start_tm":1587083395,"end_tm":0,"provider":2,"stream_infos":[{"bitrate":0,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988.flv?bizid=3954&txSecret=38ec71d0cd0801b1ae6a04637d7e636e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjOH6UwDmsWjiGxkMUvlaVat6fl2QLbMYwQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRE0tejNkYzZNRkFEOEFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTG8xgDWAOzwDwQ%3D","desc":"蓝光8M","h265_play_url":"","level_type":8,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=0&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":1080,"width":1920},{"bitrate":4000,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988_4000.flv?bizid=3954&txSecret=d5d745b42c391f884c340835e04fa404&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhgQQXDx2on6GqFsv3k9uj0eFHRRKCNiRSgQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBQXpfRDNkYzZNRkFFQUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxD6DGANYA7PAPBA%3D%3D","desc":"蓝光4M","h265_play_url":"http://flv265-3954.liveplay.myqcloud.com/live/3954_383204988_4000.flv?bizid=3954&txSecret=d5d745b42c391f884c340835e04fa404&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjPcXPpVrkIJDaJ6uTr1G%2B7lLw3GrSX%2B6cQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBQnNfRDNkYzZNRkFFRUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxD6DGANYA7PAPBA%3D%3D","level_type":4,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=2000&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":0,"width":0},{"bitrate":1200,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988_1200.flv?bizid=3954&txSecret=848676262c17d688091974917eeece4e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjpJE2HyKs7rBXFsrzQIVBzHeQPaKsdhWcQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBQ2FfRDNkYzZNRkFFSUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxBLDGANYA7PAPBA%3D%3D","desc":"高清","h265_play_url":"http://flv265-3954.liveplay.myqcloud.com/live/3954_383204988_1200.flv?bizid=3954&txSecret=848676262c17d688091974917eeece4e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhiuU%2B2os5A7mJRsHqlKnwYhPKKLofhjgtsQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRERfRDNkYzZNRkFFTUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxBLDGANYA7PAPBA%3D%3D","level_type":2,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=1200&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":0,"width":0},{"bitrate":500,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988_500.flv?bizid=3954&txSecret=f7c16cb075caff1fea96c61170bc713b&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjMWbu3M8tVMQYNa7nzV33fGuHZIRCECb8QASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRDFfRDNkYzZNRkFFUUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxAfTGANYA7PAPBA%3D%3D","desc":"流畅","h265_play_url":"","level_type":1,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=1200&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":0,"width":0}],"v_attr":{"source":"egame_obs","hv_direction":1,"v_cache_tm_max":4,"v_cache_tm_min":4,"dual_id":199,"dual_type":2,"v_play_mode":3,"v_width":1920,"v_height":1080},"game_icon":"http://shp.qpic.cn/pggamehead/0/1508764619_773_100x100/0?new=1.0&w=100&h=100","player_type":2,"use_p2p":false,"p2p_v_attr":{"v_cache_tm_max":0,"v_cache_tm_min":0,"v_play_mode":0,"conf_data":""},"unlogin_highest_level":0,"level_type":0},"profile_info":{"nick_name":"小智","face_url":"http://shp.qlogo.cn/pghead/PiajxSqBRaEJWFec9icZFDz1N8vCzibF6CNfCBs1Hia6MjA/140","max_face_size":640,"face_update_ts":1585910140,"sex":1,"city":"葫芦岛","province":"辽宁","country":"中国","register_ts":1509649994,"login_type":1,"role":1,"brief":"抖音号：cjxiaozhi2333 微视号：xiaozhi2333。欢迎大家关注！","poster_url":"http://shp.qlogo.cn/pghead/PiajxSqBRaEJWFec9icZFDz1N8vCzibF6CNfCBs1Hia6MjA/0","is_live":1,"fans_count":2468302,"video_count":647,"user_priv":{"priv_base":{"level":14,"level_pic":"http://imgcache.qq.com/club/mobile/qgame/images/level/level_14_min.png"},"used_medals":[],"noble_info":{"level":0,"u_sh":""},"priv_base_new":{"level":35,"level_pic":""}},"uid":383204988,"alias_id":2333},"h5_url":"http://shp.qpic.cn/pggamehead/0/1541644500_883_690x72/0?new=1.0&w=690&h=72","pay_info":{"play_info":{"live_pay_type":0,"free_watch_time":0,"status":0,"match_info":{"match_name":"","player_name":"","match_id":"","player_id":""},"support_platform":[],"pay_live":0},"buy_info":{"fee":0,"ticket_gift_ids":[]}}}
                 * message : 成功
                 * result : 0
                 * svr_time : 1587092912
                 * time_cost : 64
                 */

                private DataBean data;
                private String message;
                private int result;
                private int svr_time;
                private int time_cost;

                public DataBean getData() {
                    return data;
                }

                public void setData(DataBean data) {
                    this.data = data;
                }

                public String getMessage() {
                    return message;
                }

                public void setMessage(String message) {
                    this.message = message;
                }

                public int getResult() {
                    return result;
                }

                public void setResult(int result) {
                    this.result = result;
                }

                public int getSvr_time() {
                    return svr_time;
                }

                public void setSvr_time(int svr_time) {
                    this.svr_time = svr_time;
                }

                public int getTime_cost() {
                    return time_cost;
                }

                public void setTime_cost(int time_cost) {
                    this.time_cost = time_cost;
                }

                public static class DataBean {
                    /**
                     * video_info : {"pid":"383204988_1587083395","vid":"","channel_id":"3954_383204988","url":"http://shp.qpic.cn/pggamehead/0/1585661177_445_750x400/0","video_type":1,"tag":"专区小时榜主","title":"我是北美：早上好！","appid":"lol","appname":"英雄联盟","anchor_id":383204988,"start_tm":1587083395,"end_tm":0,"provider":2,"stream_infos":[{"bitrate":0,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988.flv?bizid=3954&txSecret=38ec71d0cd0801b1ae6a04637d7e636e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjOH6UwDmsWjiGxkMUvlaVat6fl2QLbMYwQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRE0tejNkYzZNRkFEOEFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTG8xgDWAOzwDwQ%3D","desc":"蓝光8M","h265_play_url":"","level_type":8,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=0&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":1080,"width":1920},{"bitrate":4000,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988_4000.flv?bizid=3954&txSecret=d5d745b42c391f884c340835e04fa404&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhgQQXDx2on6GqFsv3k9uj0eFHRRKCNiRSgQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBQXpfRDNkYzZNRkFFQUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxD6DGANYA7PAPBA%3D%3D","desc":"蓝光4M","h265_play_url":"http://flv265-3954.liveplay.myqcloud.com/live/3954_383204988_4000.flv?bizid=3954&txSecret=d5d745b42c391f884c340835e04fa404&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjPcXPpVrkIJDaJ6uTr1G%2B7lLw3GrSX%2B6cQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBQnNfRDNkYzZNRkFFRUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxD6DGANYA7PAPBA%3D%3D","level_type":4,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=2000&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":0,"width":0},{"bitrate":1200,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988_1200.flv?bizid=3954&txSecret=848676262c17d688091974917eeece4e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjpJE2HyKs7rBXFsrzQIVBzHeQPaKsdhWcQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBQ2FfRDNkYzZNRkFFSUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxBLDGANYA7PAPBA%3D%3D","desc":"高清","h265_play_url":"http://flv265-3954.liveplay.myqcloud.com/live/3954_383204988_1200.flv?bizid=3954&txSecret=848676262c17d688091974917eeece4e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhiuU%2B2os5A7mJRsHqlKnwYhPKKLofhjgtsQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRERfRDNkYzZNRkFFTUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxBLDGANYA7PAPBA%3D%3D","level_type":2,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=1200&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":0,"width":0},{"bitrate":500,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988_500.flv?bizid=3954&txSecret=f7c16cb075caff1fea96c61170bc713b&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjMWbu3M8tVMQYNa7nzV33fGuHZIRCECb8QASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRDFfRDNkYzZNRkFFUUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxAfTGANYA7PAPBA%3D%3D","desc":"流畅","h265_play_url":"","level_type":1,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=1200&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":0,"width":0}],"v_attr":{"source":"egame_obs","hv_direction":1,"v_cache_tm_max":4,"v_cache_tm_min":4,"dual_id":199,"dual_type":2,"v_play_mode":3,"v_width":1920,"v_height":1080},"game_icon":"http://shp.qpic.cn/pggamehead/0/1508764619_773_100x100/0?new=1.0&w=100&h=100","player_type":2,"use_p2p":false,"p2p_v_attr":{"v_cache_tm_max":0,"v_cache_tm_min":0,"v_play_mode":0,"conf_data":""},"unlogin_highest_level":0,"level_type":0}
                     * profile_info : {"nick_name":"小智","face_url":"http://shp.qlogo.cn/pghead/PiajxSqBRaEJWFec9icZFDz1N8vCzibF6CNfCBs1Hia6MjA/140","max_face_size":640,"face_update_ts":1585910140,"sex":1,"city":"葫芦岛","province":"辽宁","country":"中国","register_ts":1509649994,"login_type":1,"role":1,"brief":"抖音号：cjxiaozhi2333 微视号：xiaozhi2333。欢迎大家关注！","poster_url":"http://shp.qlogo.cn/pghead/PiajxSqBRaEJWFec9icZFDz1N8vCzibF6CNfCBs1Hia6MjA/0","is_live":1,"fans_count":2468302,"video_count":647,"user_priv":{"priv_base":{"level":14,"level_pic":"http://imgcache.qq.com/club/mobile/qgame/images/level/level_14_min.png"},"used_medals":[],"noble_info":{"level":0,"u_sh":""},"priv_base_new":{"level":35,"level_pic":""}},"uid":383204988,"alias_id":2333}
                     * h5_url : http://shp.qpic.cn/pggamehead/0/1541644500_883_690x72/0?new=1.0&w=690&h=72
                     * pay_info : {"play_info":{"live_pay_type":0,"free_watch_time":0,"status":0,"match_info":{"match_name":"","player_name":"","match_id":"","player_id":""},"support_platform":[],"pay_live":0},"buy_info":{"fee":0,"ticket_gift_ids":[]}}
                     */

                    private VideoInfoBean video_info;
                    private ProfileInfoBean profile_info;
                    private String h5_url;
                    private PayInfoBean pay_info;

                    public VideoInfoBean getVideo_info() {
                        return video_info;
                    }

                    public void setVideo_info(VideoInfoBean video_info) {
                        this.video_info = video_info;
                    }

                    public ProfileInfoBean getProfile_info() {
                        return profile_info;
                    }

                    public void setProfile_info(ProfileInfoBean profile_info) {
                        this.profile_info = profile_info;
                    }

                    public String getH5_url() {
                        return h5_url;
                    }

                    public void setH5_url(String h5_url) {
                        this.h5_url = h5_url;
                    }

                    public PayInfoBean getPay_info() {
                        return pay_info;
                    }

                    public void setPay_info(PayInfoBean pay_info) {
                        this.pay_info = pay_info;
                    }

                    public static class VideoInfoBean {
                        /**
                         * pid : 383204988_1587083395
                         * vid :
                         * channel_id : 3954_383204988
                         * url : http://shp.qpic.cn/pggamehead/0/1585661177_445_750x400/0
                         * video_type : 1
                         * tag : 专区小时榜主
                         * title : 我是北美：早上好！
                         * appid : lol
                         * appname : 英雄联盟
                         * anchor_id : 383204988
                         * start_tm : 1587083395
                         * end_tm : 0
                         * provider : 2
                         * stream_infos : [{"bitrate":0,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988.flv?bizid=3954&txSecret=38ec71d0cd0801b1ae6a04637d7e636e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjOH6UwDmsWjiGxkMUvlaVat6fl2QLbMYwQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRE0tejNkYzZNRkFEOEFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTG8xgDWAOzwDwQ%3D","desc":"蓝光8M","h265_play_url":"","level_type":8,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=0&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":1080,"width":1920},{"bitrate":4000,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988_4000.flv?bizid=3954&txSecret=d5d745b42c391f884c340835e04fa404&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhgQQXDx2on6GqFsv3k9uj0eFHRRKCNiRSgQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBQXpfRDNkYzZNRkFFQUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxD6DGANYA7PAPBA%3D%3D","desc":"蓝光4M","h265_play_url":"http://flv265-3954.liveplay.myqcloud.com/live/3954_383204988_4000.flv?bizid=3954&txSecret=d5d745b42c391f884c340835e04fa404&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjPcXPpVrkIJDaJ6uTr1G%2B7lLw3GrSX%2B6cQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBQnNfRDNkYzZNRkFFRUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxD6DGANYA7PAPBA%3D%3D","level_type":4,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=2000&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":0,"width":0},{"bitrate":1200,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988_1200.flv?bizid=3954&txSecret=848676262c17d688091974917eeece4e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjpJE2HyKs7rBXFsrzQIVBzHeQPaKsdhWcQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBQ2FfRDNkYzZNRkFFSUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxBLDGANYA7PAPBA%3D%3D","desc":"高清","h265_play_url":"http://flv265-3954.liveplay.myqcloud.com/live/3954_383204988_1200.flv?bizid=3954&txSecret=848676262c17d688091974917eeece4e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhiuU%2B2os5A7mJRsHqlKnwYhPKKLofhjgtsQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRERfRDNkYzZNRkFFTUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxBLDGANYA7PAPBA%3D%3D","level_type":2,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=1200&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":0,"width":0},{"bitrate":500,"play_url":"http://3954-out.liveplay.myqcloud.com/live/3954_383204988_500.flv?bizid=3954&txSecret=f7c16cb075caff1fea96c61170bc713b&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjMWbu3M8tVMQYNa7nzV33fGuHZIRCECb8QASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRDFfRDNkYzZNRkFFUUFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTGxAfTGANYA7PAPBA%3D%3D","desc":"流畅","h265_play_url":"","level_type":1,"play_url_conf_data":"","h265_play_url_conf_data":"","play_time_shift_url":"http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=1200&appid=1251883823&uid=206600472&fromdj=","h265_decode_type":0,"file_size":0,"height":0,"width":0}]
                         * v_attr : {"source":"egame_obs","hv_direction":1,"v_cache_tm_max":4,"v_cache_tm_min":4,"dual_id":199,"dual_type":2,"v_play_mode":3,"v_width":1920,"v_height":1080}
                         * game_icon : http://shp.qpic.cn/pggamehead/0/1508764619_773_100x100/0?new=1.0&w=100&h=100
                         * player_type : 2
                         * use_p2p : false
                         * p2p_v_attr : {"v_cache_tm_max":0,"v_cache_tm_min":0,"v_play_mode":0,"conf_data":""}
                         * unlogin_highest_level : 0
                         * level_type : 0
                         */

                        private String pid;
                        private String vid;
                        private String channel_id;
                        private String url;
                        private int video_type;
                        private String tag;
                        private String title;
                        private String appid;
                        private String appname;
                        private int anchor_id;
                        private int start_tm;
                        private int end_tm;
                        private int provider;
                        private VAttrBean v_attr;
                        private String game_icon;
                        private int player_type;
                        private boolean use_p2p;
                        private P2pVAttrBean p2p_v_attr;
                        private int unlogin_highest_level;
                        private int level_type;
                        private List<StreamInfosBean> stream_infos;

                        public String getPid() {
                            return pid;
                        }

                        public void setPid(String pid) {
                            this.pid = pid;
                        }

                        public String getVid() {
                            return vid;
                        }

                        public void setVid(String vid) {
                            this.vid = vid;
                        }

                        public String getChannel_id() {
                            return channel_id;
                        }

                        public void setChannel_id(String channel_id) {
                            this.channel_id = channel_id;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public int getVideo_type() {
                            return video_type;
                        }

                        public void setVideo_type(int video_type) {
                            this.video_type = video_type;
                        }

                        public String getTag() {
                            return tag;
                        }

                        public void setTag(String tag) {
                            this.tag = tag;
                        }

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public String getAppid() {
                            return appid;
                        }

                        public void setAppid(String appid) {
                            this.appid = appid;
                        }

                        public String getAppname() {
                            return appname;
                        }

                        public void setAppname(String appname) {
                            this.appname = appname;
                        }

                        public int getAnchor_id() {
                            return anchor_id;
                        }

                        public void setAnchor_id(int anchor_id) {
                            this.anchor_id = anchor_id;
                        }

                        public int getStart_tm() {
                            return start_tm;
                        }

                        public void setStart_tm(int start_tm) {
                            this.start_tm = start_tm;
                        }

                        public int getEnd_tm() {
                            return end_tm;
                        }

                        public void setEnd_tm(int end_tm) {
                            this.end_tm = end_tm;
                        }

                        public int getProvider() {
                            return provider;
                        }

                        public void setProvider(int provider) {
                            this.provider = provider;
                        }

                        public VAttrBean getV_attr() {
                            return v_attr;
                        }

                        public void setV_attr(VAttrBean v_attr) {
                            this.v_attr = v_attr;
                        }

                        public String getGame_icon() {
                            return game_icon;
                        }

                        public void setGame_icon(String game_icon) {
                            this.game_icon = game_icon;
                        }

                        public int getPlayer_type() {
                            return player_type;
                        }

                        public void setPlayer_type(int player_type) {
                            this.player_type = player_type;
                        }

                        public boolean isUse_p2p() {
                            return use_p2p;
                        }

                        public void setUse_p2p(boolean use_p2p) {
                            this.use_p2p = use_p2p;
                        }

                        public P2pVAttrBean getP2p_v_attr() {
                            return p2p_v_attr;
                        }

                        public void setP2p_v_attr(P2pVAttrBean p2p_v_attr) {
                            this.p2p_v_attr = p2p_v_attr;
                        }

                        public int getUnlogin_highest_level() {
                            return unlogin_highest_level;
                        }

                        public void setUnlogin_highest_level(int unlogin_highest_level) {
                            this.unlogin_highest_level = unlogin_highest_level;
                        }

                        public int getLevel_type() {
                            return level_type;
                        }

                        public void setLevel_type(int level_type) {
                            this.level_type = level_type;
                        }

                        public List<StreamInfosBean> getStream_infos() {
                            return stream_infos;
                        }

                        public void setStream_infos(List<StreamInfosBean> stream_infos) {
                            this.stream_infos = stream_infos;
                        }

                        public static class VAttrBean {
                            /**
                             * source : egame_obs
                             * hv_direction : 1
                             * v_cache_tm_max : 4
                             * v_cache_tm_min : 4
                             * dual_id : 199
                             * dual_type : 2
                             * v_play_mode : 3
                             * v_width : 1920
                             * v_height : 1080
                             */

                            private String source;
                            private int hv_direction;
                            private int v_cache_tm_max;
                            private int v_cache_tm_min;
                            private int dual_id;
                            private int dual_type;
                            private int v_play_mode;
                            private int v_width;
                            private int v_height;

                            public String getSource() {
                                return source;
                            }

                            public void setSource(String source) {
                                this.source = source;
                            }

                            public int getHv_direction() {
                                return hv_direction;
                            }

                            public void setHv_direction(int hv_direction) {
                                this.hv_direction = hv_direction;
                            }

                            public int getV_cache_tm_max() {
                                return v_cache_tm_max;
                            }

                            public void setV_cache_tm_max(int v_cache_tm_max) {
                                this.v_cache_tm_max = v_cache_tm_max;
                            }

                            public int getV_cache_tm_min() {
                                return v_cache_tm_min;
                            }

                            public void setV_cache_tm_min(int v_cache_tm_min) {
                                this.v_cache_tm_min = v_cache_tm_min;
                            }

                            public int getDual_id() {
                                return dual_id;
                            }

                            public void setDual_id(int dual_id) {
                                this.dual_id = dual_id;
                            }

                            public int getDual_type() {
                                return dual_type;
                            }

                            public void setDual_type(int dual_type) {
                                this.dual_type = dual_type;
                            }

                            public int getV_play_mode() {
                                return v_play_mode;
                            }

                            public void setV_play_mode(int v_play_mode) {
                                this.v_play_mode = v_play_mode;
                            }

                            public int getV_width() {
                                return v_width;
                            }

                            public void setV_width(int v_width) {
                                this.v_width = v_width;
                            }

                            public int getV_height() {
                                return v_height;
                            }

                            public void setV_height(int v_height) {
                                this.v_height = v_height;
                            }
                        }

                        public static class P2pVAttrBean {
                            /**
                             * v_cache_tm_max : 0
                             * v_cache_tm_min : 0
                             * v_play_mode : 0
                             * conf_data :
                             */

                            private int v_cache_tm_max;
                            private int v_cache_tm_min;
                            private int v_play_mode;
                            private String conf_data;

                            public int getV_cache_tm_max() {
                                return v_cache_tm_max;
                            }

                            public void setV_cache_tm_max(int v_cache_tm_max) {
                                this.v_cache_tm_max = v_cache_tm_max;
                            }

                            public int getV_cache_tm_min() {
                                return v_cache_tm_min;
                            }

                            public void setV_cache_tm_min(int v_cache_tm_min) {
                                this.v_cache_tm_min = v_cache_tm_min;
                            }

                            public int getV_play_mode() {
                                return v_play_mode;
                            }

                            public void setV_play_mode(int v_play_mode) {
                                this.v_play_mode = v_play_mode;
                            }

                            public String getConf_data() {
                                return conf_data;
                            }

                            public void setConf_data(String conf_data) {
                                this.conf_data = conf_data;
                            }
                        }

                        public static class StreamInfosBean {
                            /**
                             * bitrate : 0
                             * play_url : http://3954-out.liveplay.myqcloud.com/live/3954_383204988.flv?bizid=3954&txSecret=38ec71d0cd0801b1ae6a04637d7e636e&txTime=5ea23303&uid=206600472&fromdj=&_qedj_t=BhjOH6UwDmsWjiGxkMUvlaVat6fl2QLbMYwQASYUMzgzMjA0OTg4XzE1ODcwODMzOTUyXpkdr0IMUHkYVhxhcG1NQ2E1ekFBRE0tejNkYzZNRkFEOEFwQ0ZoZgBwAYYrcGdnX2xpdmVfcmVhZF9pZmNfbXRfc3ZyLmVudHJ5X2g1X2xpdmVfcm9vbZYBMKYOMTQ0LjUyLjE1MS4xNTG8xgDWAOzwDwQ%3D
                             * desc : 蓝光8M
                             * h265_play_url :
                             * level_type : 8
                             * play_url_conf_data :
                             * h265_play_url_conf_data :
                             * play_time_shift_url : http://3954-playtimeshift.live.egame.qq.com/3954/3954_383204988/timeshift.m3u8?starttime=20200417082955&txKbps=0&appid=1251883823&uid=206600472&fromdj=
                             * h265_decode_type : 0
                             * file_size : 0
                             * height : 1080
                             * width : 1920
                             */

                            private int bitrate;
                            private String play_url;
                            private String desc;
                            private String h265_play_url;
                            private int level_type;
                            private String play_url_conf_data;
                            private String h265_play_url_conf_data;
                            private String play_time_shift_url;
                            private int h265_decode_type;
                            private int file_size;
                            private int height;
                            private int width;

                            public int getBitrate() {
                                return bitrate;
                            }

                            public void setBitrate(int bitrate) {
                                this.bitrate = bitrate;
                            }

                            public String getPlay_url() {
                                return play_url;
                            }

                            public void setPlay_url(String play_url) {
                                this.play_url = play_url;
                            }

                            public String getDesc() {
                                return desc;
                            }

                            public void setDesc(String desc) {
                                this.desc = desc;
                            }

                            public String getH265_play_url() {
                                return h265_play_url;
                            }

                            public void setH265_play_url(String h265_play_url) {
                                this.h265_play_url = h265_play_url;
                            }

                            public int getLevel_type() {
                                return level_type;
                            }

                            public void setLevel_type(int level_type) {
                                this.level_type = level_type;
                            }

                            public String getPlay_url_conf_data() {
                                return play_url_conf_data;
                            }

                            public void setPlay_url_conf_data(String play_url_conf_data) {
                                this.play_url_conf_data = play_url_conf_data;
                            }

                            public String getH265_play_url_conf_data() {
                                return h265_play_url_conf_data;
                            }

                            public void setH265_play_url_conf_data(String h265_play_url_conf_data) {
                                this.h265_play_url_conf_data = h265_play_url_conf_data;
                            }

                            public String getPlay_time_shift_url() {
                                return play_time_shift_url;
                            }

                            public void setPlay_time_shift_url(String play_time_shift_url) {
                                this.play_time_shift_url = play_time_shift_url;
                            }

                            public int getH265_decode_type() {
                                return h265_decode_type;
                            }

                            public void setH265_decode_type(int h265_decode_type) {
                                this.h265_decode_type = h265_decode_type;
                            }

                            public int getFile_size() {
                                return file_size;
                            }

                            public void setFile_size(int file_size) {
                                this.file_size = file_size;
                            }

                            public int getHeight() {
                                return height;
                            }

                            public void setHeight(int height) {
                                this.height = height;
                            }

                            public int getWidth() {
                                return width;
                            }

                            public void setWidth(int width) {
                                this.width = width;
                            }
                        }
                    }

                    public static class ProfileInfoBean {
                        /**
                         * nick_name : 小智
                         * face_url : http://shp.qlogo.cn/pghead/PiajxSqBRaEJWFec9icZFDz1N8vCzibF6CNfCBs1Hia6MjA/140
                         * max_face_size : 640
                         * face_update_ts : 1585910140
                         * sex : 1
                         * city : 葫芦岛
                         * province : 辽宁
                         * country : 中国
                         * register_ts : 1509649994
                         * login_type : 1
                         * role : 1
                         * brief : 抖音号：cjxiaozhi2333 微视号：xiaozhi2333。欢迎大家关注！
                         * poster_url : http://shp.qlogo.cn/pghead/PiajxSqBRaEJWFec9icZFDz1N8vCzibF6CNfCBs1Hia6MjA/0
                         * is_live : 1
                         * fans_count : 2468302
                         * video_count : 647
                         * user_priv : {"priv_base":{"level":14,"level_pic":"http://imgcache.qq.com/club/mobile/qgame/images/level/level_14_min.png"},"used_medals":[],"noble_info":{"level":0,"u_sh":""},"priv_base_new":{"level":35,"level_pic":""}}
                         * uid : 383204988
                         * alias_id : 2333
                         */

                        private String nick_name;
                        private String face_url;
                        private int max_face_size;
                        private int face_update_ts;
                        private int sex;
                        private String city;
                        private String province;
                        private String country;
                        private int register_ts;
                        private int login_type;
                        private int role;
                        private String brief;
                        private String poster_url;
                        private int is_live;
                        private int fans_count;
                        private int video_count;
                        private UserPrivBean user_priv;
                        private int uid;
                        private int alias_id;

                        public String getNick_name() {
                            return nick_name;
                        }

                        public void setNick_name(String nick_name) {
                            this.nick_name = nick_name;
                        }

                        public String getFace_url() {
                            return face_url;
                        }

                        public void setFace_url(String face_url) {
                            this.face_url = face_url;
                        }

                        public int getMax_face_size() {
                            return max_face_size;
                        }

                        public void setMax_face_size(int max_face_size) {
                            this.max_face_size = max_face_size;
                        }

                        public int getFace_update_ts() {
                            return face_update_ts;
                        }

                        public void setFace_update_ts(int face_update_ts) {
                            this.face_update_ts = face_update_ts;
                        }

                        public int getSex() {
                            return sex;
                        }

                        public void setSex(int sex) {
                            this.sex = sex;
                        }

                        public String getCity() {
                            return city;
                        }

                        public void setCity(String city) {
                            this.city = city;
                        }

                        public String getProvince() {
                            return province;
                        }

                        public void setProvince(String province) {
                            this.province = province;
                        }

                        public String getCountry() {
                            return country;
                        }

                        public void setCountry(String country) {
                            this.country = country;
                        }

                        public int getRegister_ts() {
                            return register_ts;
                        }

                        public void setRegister_ts(int register_ts) {
                            this.register_ts = register_ts;
                        }

                        public int getLogin_type() {
                            return login_type;
                        }

                        public void setLogin_type(int login_type) {
                            this.login_type = login_type;
                        }

                        public int getRole() {
                            return role;
                        }

                        public void setRole(int role) {
                            this.role = role;
                        }

                        public String getBrief() {
                            return brief;
                        }

                        public void setBrief(String brief) {
                            this.brief = brief;
                        }

                        public String getPoster_url() {
                            return poster_url;
                        }

                        public void setPoster_url(String poster_url) {
                            this.poster_url = poster_url;
                        }

                        public int getIs_live() {
                            return is_live;
                        }

                        public void setIs_live(int is_live) {
                            this.is_live = is_live;
                        }

                        public int getFans_count() {
                            return fans_count;
                        }

                        public void setFans_count(int fans_count) {
                            this.fans_count = fans_count;
                        }

                        public int getVideo_count() {
                            return video_count;
                        }

                        public void setVideo_count(int video_count) {
                            this.video_count = video_count;
                        }

                        public UserPrivBean getUser_priv() {
                            return user_priv;
                        }

                        public void setUser_priv(UserPrivBean user_priv) {
                            this.user_priv = user_priv;
                        }

                        public int getUid() {
                            return uid;
                        }

                        public void setUid(int uid) {
                            this.uid = uid;
                        }

                        public int getAlias_id() {
                            return alias_id;
                        }

                        public void setAlias_id(int alias_id) {
                            this.alias_id = alias_id;
                        }

                        public static class UserPrivBean {
                            /**
                             * priv_base : {"level":14,"level_pic":"http://imgcache.qq.com/club/mobile/qgame/images/level/level_14_min.png"}
                             * used_medals : []
                             * noble_info : {"level":0,"u_sh":""}
                             * priv_base_new : {"level":35,"level_pic":""}
                             */

                            private PrivBaseBean priv_base;
                            private NobleInfoBean noble_info;
                            private PrivBaseNewBean priv_base_new;
                            private List<?> used_medals;

                            public PrivBaseBean getPriv_base() {
                                return priv_base;
                            }

                            public void setPriv_base(PrivBaseBean priv_base) {
                                this.priv_base = priv_base;
                            }

                            public NobleInfoBean getNoble_info() {
                                return noble_info;
                            }

                            public void setNoble_info(NobleInfoBean noble_info) {
                                this.noble_info = noble_info;
                            }

                            public PrivBaseNewBean getPriv_base_new() {
                                return priv_base_new;
                            }

                            public void setPriv_base_new(PrivBaseNewBean priv_base_new) {
                                this.priv_base_new = priv_base_new;
                            }

                            public List<?> getUsed_medals() {
                                return used_medals;
                            }

                            public void setUsed_medals(List<?> used_medals) {
                                this.used_medals = used_medals;
                            }

                            public static class PrivBaseBean {
                                /**
                                 * level : 14
                                 * level_pic : http://imgcache.qq.com/club/mobile/qgame/images/level/level_14_min.png
                                 */

                                private int level;
                                private String level_pic;

                                public int getLevel() {
                                    return level;
                                }

                                public void setLevel(int level) {
                                    this.level = level;
                                }

                                public String getLevel_pic() {
                                    return level_pic;
                                }

                                public void setLevel_pic(String level_pic) {
                                    this.level_pic = level_pic;
                                }
                            }

                            public static class NobleInfoBean {
                                /**
                                 * level : 0
                                 * u_sh :
                                 */

                                private int level;
                                private String u_sh;

                                public int getLevel() {
                                    return level;
                                }

                                public void setLevel(int level) {
                                    this.level = level;
                                }

                                public String getU_sh() {
                                    return u_sh;
                                }

                                public void setU_sh(String u_sh) {
                                    this.u_sh = u_sh;
                                }
                            }

                            public static class PrivBaseNewBean {
                                /**
                                 * level : 35
                                 * level_pic :
                                 */

                                private int level;
                                private String level_pic;

                                public int getLevel() {
                                    return level;
                                }

                                public void setLevel(int level) {
                                    this.level = level;
                                }

                                public String getLevel_pic() {
                                    return level_pic;
                                }

                                public void setLevel_pic(String level_pic) {
                                    this.level_pic = level_pic;
                                }
                            }
                        }
                    }

                    public static class PayInfoBean {
                        /**
                         * play_info : {"live_pay_type":0,"free_watch_time":0,"status":0,"match_info":{"match_name":"","player_name":"","match_id":"","player_id":""},"support_platform":[],"pay_live":0}
                         * buy_info : {"fee":0,"ticket_gift_ids":[]}
                         */

                        private PlayInfoBean play_info;
                        private BuyInfoBean buy_info;

                        public PlayInfoBean getPlay_info() {
                            return play_info;
                        }

                        public void setPlay_info(PlayInfoBean play_info) {
                            this.play_info = play_info;
                        }

                        public BuyInfoBean getBuy_info() {
                            return buy_info;
                        }

                        public void setBuy_info(BuyInfoBean buy_info) {
                            this.buy_info = buy_info;
                        }

                        public static class PlayInfoBean {
                            /**
                             * live_pay_type : 0
                             * free_watch_time : 0
                             * status : 0
                             * match_info : {"match_name":"","player_name":"","match_id":"","player_id":""}
                             * support_platform : []
                             * pay_live : 0
                             */

                            private int live_pay_type;
                            private int free_watch_time;
                            private int status;
                            private MatchInfoBean match_info;
                            private int pay_live;
                            private List<?> support_platform;

                            public int getLive_pay_type() {
                                return live_pay_type;
                            }

                            public void setLive_pay_type(int live_pay_type) {
                                this.live_pay_type = live_pay_type;
                            }

                            public int getFree_watch_time() {
                                return free_watch_time;
                            }

                            public void setFree_watch_time(int free_watch_time) {
                                this.free_watch_time = free_watch_time;
                            }

                            public int getStatus() {
                                return status;
                            }

                            public void setStatus(int status) {
                                this.status = status;
                            }

                            public MatchInfoBean getMatch_info() {
                                return match_info;
                            }

                            public void setMatch_info(MatchInfoBean match_info) {
                                this.match_info = match_info;
                            }

                            public int getPay_live() {
                                return pay_live;
                            }

                            public void setPay_live(int pay_live) {
                                this.pay_live = pay_live;
                            }

                            public List<?> getSupport_platform() {
                                return support_platform;
                            }

                            public void setSupport_platform(List<?> support_platform) {
                                this.support_platform = support_platform;
                            }

                            public static class MatchInfoBean {
                                /**
                                 * match_name :
                                 * player_name :
                                 * match_id :
                                 * player_id :
                                 */

                                private String match_name;
                                private String player_name;
                                private String match_id;
                                private String player_id;

                                public String getMatch_name() {
                                    return match_name;
                                }

                                public void setMatch_name(String match_name) {
                                    this.match_name = match_name;
                                }

                                public String getPlayer_name() {
                                    return player_name;
                                }

                                public void setPlayer_name(String player_name) {
                                    this.player_name = player_name;
                                }

                                public String getMatch_id() {
                                    return match_id;
                                }

                                public void setMatch_id(String match_id) {
                                    this.match_id = match_id;
                                }

                                public String getPlayer_id() {
                                    return player_id;
                                }

                                public void setPlayer_id(String player_id) {
                                    this.player_id = player_id;
                                }
                            }
                        }

                        public static class BuyInfoBean {
                            /**
                             * fee : 0
                             * ticket_gift_ids : []
                             */

                            private int fee;
                            private List<?> ticket_gift_ids;

                            public int getFee() {
                                return fee;
                            }

                            public void setFee(int fee) {
                                this.fee = fee;
                            }

                            public List<?> getTicket_gift_ids() {
                                return ticket_gift_ids;
                            }

                            public void setTicket_gift_ids(List<?> ticket_gift_ids) {
                                this.ticket_gift_ids = ticket_gift_ids;
                            }
                        }
                    }
                }
            }
        }
    }
}
