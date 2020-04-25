package com.EncryptBean;

import java.util.List;

public class egameDatebean {
    /**
     * video_info : {"vid":"497383565_1587718318","video_type":1,"url":"http://shp.qpic.cn/pggamehead/0/1583760042_910_750x400/374","dst":"http://3954.liveplay.myqcloud.com/live/3954_497383565_1200.flv?bizid=3954&txSecret=a11f6abfbc52a72594012b175862eb3e&txTime=5eabe32e&fromdj=&_qedj_t=Bhg1CixdSaYrf7JBh0riFfkt1Y%2FvsxHCErYQASYUNDk3MzgzNTY1XzE1ODc3MTgzMTgyXqLtskxWHE9nSXpDcUVTQUFCMjlIcVhDYVFGQUVkdHlRQmhmAHAChjFwZ2dfbGl2ZV9yZWFkX2lmY19tdF9zdnIuZ2V0X2xpdmVfbGlzdF9ieV9yZWNtX2g1lgl1bmRlZmluZWSmDjE0NC41Mi4xNTEuMTUxvMYA1gDs8A8E","provider":2,"v_attr":{"source":"egame_obs","hv_direction":1,"v_cache_tm_max":0,"v_cache_tm_min":0,"dual_id":198,"dual_type":2,"v_play_mode":0,"v_width":0,"v_height":0},"channel_id":"","play_url":"http://3954.liveplay.myqcloud.com/live/3954_497383565_1200.flv?bizid=3954&txSecret=a11f6abfbc52a72594012b175862eb3e&txTime=5eabe32e&fromdj=&_qedj_t=Bhi6I%2FN43L5MsXmUW%2Bh3H5WmIl97sDYJm8IQASYUNDk3MzgzNTY1XzE1ODc3MTgzMTgyXqLtskxWHE9nSXpDcUVTQUFBWjlIcVhDYVFGQUVadHlRQmhmAHAChjFwZ2dfbGl2ZV9yZWFkX2lmY19tdF9zdnIuZ2V0X2xpdmVfbGlzdF9ieV9yZWNtX2g1lgl1bmRlZmluZWSmDjE0NC41Mi4xNTEuMTUxvMYA1gDs8A8E","url_high_reslution":"http://shp.qpic.cn/pggamehead/0/1583760042_910_750x400/0","h265_url":"http://flv265-3954.liveplay.myqcloud.com/live/3954_497383565_1200.flv?bizid=3954&txSecret=a11f6abfbc52a72594012b175862eb3e&txTime=5eabe32e&fromdj=&_qedj_t=BhjqahXyFCGPWUtU5fut%2B2CfOKrumSZs48cQASYUNDk3MzgzNTY1XzE1ODc3MTgzMTgyXqLtskxWHE9nSXpDcUVTQUFDcDlIcVhDYVFGQUVodHlRQmhmAHAChjFwZ2dfbGl2ZV9yZWFkX2lmY19tdF9zdnIuZ2V0X2xpdmVfbGlzdF9ieV9yZWNtX2g1lgl1bmRlZmluZWSmDjE0NC41Mi4xNTEuMTUxvMYA1gDs8A8E","player_type":2,"h265_decode_type":0,"url_low_resolution":"","bg_color_pc":"","bitrate":0,"desc":""}
     * tag : 专区小时榜NO.2
     * title : 德云色解说季后赛TES VS WE!
     * anchor_id : 497383565
     * anchor_name : 老实敦厚的笑笑
     * online : 6710574
     * appid : lol
     * appname : 英雄联盟
     * anchor_face_url : http://shp.qlogo.cn/pghead/PiajxSqBRaELUfPEfjb8orLkthcBqdEp7CiaEUWaoicVhg/140
     * city : 徐汇
     * fans_count : 1424539
     * ext : {}
     * user_priv : {"priv_base":{"level":0,"level_pic":""},"used_medals":[],"noble_info":{"level":0,"u_sh":""},"priv_base_new":{"level":0,"level_pic":""}}
     * certified_status : 0
     * win_rate : 0
     * jump_url : http://sdk.egame.qq.com/sdk/live?egame_id=kandian&anchorid=497383565&ADTAG=sdk.kandian
     * report_info : {"strategy_id":0,"algo_source":1,"algo_id":0,"resource_id":0,"algo_info":""}
     * user_bet_num : 0
     * user_bet_coin : 0
     * program_res : {"right_tag":{"name":"专区小时榜NO.2","style_type":700,"priority":10005200},"left_tag":{"name":"","style_type":0,"priority":0},"cover_url":"http://shp.qpic.cn/pggamehead/0/1583760042_910_750x400/374","icon_tag":{"url":"","position":0,"priority":0,"style_type":0},"cover_frame":{"url_16_9":"","url_1_1":""},"right_user_tag":{"name":"","style_type":0},"cover":{"cover_url":"","square_cover_url":""}}
     * use_p2p : false
     * pk_info : {"guest_anchor_id":0,"guest_cover_url":"","guest_pk_level":"","guest_face_url":""}
     * lbs_info : {"lbs_desc":"","ad_code":0}
     * live_room_style : 0
     * jump : {"room_style":1,"show_time_info":{"type":0,"data":""},"json_ext":"","ext":{"is_pay":"0"}}
     * notice_next_content :
     * notice_next_date :
     * pid :
     */

    private VideoInfoBean video_info;
    private String tag;
    private String title;
    private int anchor_id;
    private String anchor_name;
    private int online;
    private String appid;
    private String appname;
    private String anchor_face_url;
    private String city;
    private int fans_count;
    private ExtBean ext;
    private UserPrivBean user_priv;
    private int certified_status;
    private int win_rate;
    private String jump_url;
    private ReportInfoBean report_info;
    private int user_bet_num;
    private int user_bet_coin;
    private ProgramResBean program_res;
    private boolean use_p2p;
    private PkInfoBean pk_info;
    private LbsInfoBean lbs_info;
    private int live_room_style;
    private JumpBean jump;
    private String notice_next_content;
    private String notice_next_date;
    private String pid;

    public VideoInfoBean getVideo_info() {
        return video_info;
    }

    public void setVideo_info(VideoInfoBean video_info) {
        this.video_info = video_info;
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

    public int getAnchor_id() {
        return anchor_id;
    }

    public void setAnchor_id(int anchor_id) {
        this.anchor_id = anchor_id;
    }

    public String getAnchor_name() {
        return anchor_name;
    }

    public void setAnchor_name(String anchor_name) {
        this.anchor_name = anchor_name;
    }

    public int getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online;
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

    public String getAnchor_face_url() {
        return anchor_face_url;
    }

    public void setAnchor_face_url(String anchor_face_url) {
        this.anchor_face_url = anchor_face_url;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getFans_count() {
        return fans_count;
    }

    public void setFans_count(int fans_count) {
        this.fans_count = fans_count;
    }

    public ExtBean getExt() {
        return ext;
    }

    public void setExt(ExtBean ext) {
        this.ext = ext;
    }

    public UserPrivBean getUser_priv() {
        return user_priv;
    }

    public void setUser_priv(UserPrivBean user_priv) {
        this.user_priv = user_priv;
    }

    public int getCertified_status() {
        return certified_status;
    }

    public void setCertified_status(int certified_status) {
        this.certified_status = certified_status;
    }

    public int getWin_rate() {
        return win_rate;
    }

    public void setWin_rate(int win_rate) {
        this.win_rate = win_rate;
    }

    public String getJump_url() {
        return jump_url;
    }

    public void setJump_url(String jump_url) {
        this.jump_url = jump_url;
    }

    public ReportInfoBean getReport_info() {
        return report_info;
    }

    public void setReport_info(ReportInfoBean report_info) {
        this.report_info = report_info;
    }

    public int getUser_bet_num() {
        return user_bet_num;
    }

    public void setUser_bet_num(int user_bet_num) {
        this.user_bet_num = user_bet_num;
    }

    public int getUser_bet_coin() {
        return user_bet_coin;
    }

    public void setUser_bet_coin(int user_bet_coin) {
        this.user_bet_coin = user_bet_coin;
    }

    public ProgramResBean getProgram_res() {
        return program_res;
    }

    public void setProgram_res(ProgramResBean program_res) {
        this.program_res = program_res;
    }

    public boolean isUse_p2p() {
        return use_p2p;
    }

    public void setUse_p2p(boolean use_p2p) {
        this.use_p2p = use_p2p;
    }

    public PkInfoBean getPk_info() {
        return pk_info;
    }

    public void setPk_info(PkInfoBean pk_info) {
        this.pk_info = pk_info;
    }

    public LbsInfoBean getLbs_info() {
        return lbs_info;
    }

    public void setLbs_info(LbsInfoBean lbs_info) {
        this.lbs_info = lbs_info;
    }

    public int getLive_room_style() {
        return live_room_style;
    }

    public void setLive_room_style(int live_room_style) {
        this.live_room_style = live_room_style;
    }

    public JumpBean getJump() {
        return jump;
    }

    public void setJump(JumpBean jump) {
        this.jump = jump;
    }

    public String getNotice_next_content() {
        return notice_next_content;
    }

    public void setNotice_next_content(String notice_next_content) {
        this.notice_next_content = notice_next_content;
    }

    public String getNotice_next_date() {
        return notice_next_date;
    }

    public void setNotice_next_date(String notice_next_date) {
        this.notice_next_date = notice_next_date;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public static class VideoInfoBean {
        /**
         * vid : 497383565_1587718318
         * video_type : 1
         * url : http://shp.qpic.cn/pggamehead/0/1583760042_910_750x400/374
         * dst : http://3954.liveplay.myqcloud.com/live/3954_497383565_1200.flv?bizid=3954&txSecret=a11f6abfbc52a72594012b175862eb3e&txTime=5eabe32e&fromdj=&_qedj_t=Bhg1CixdSaYrf7JBh0riFfkt1Y%2FvsxHCErYQASYUNDk3MzgzNTY1XzE1ODc3MTgzMTgyXqLtskxWHE9nSXpDcUVTQUFCMjlIcVhDYVFGQUVkdHlRQmhmAHAChjFwZ2dfbGl2ZV9yZWFkX2lmY19tdF9zdnIuZ2V0X2xpdmVfbGlzdF9ieV9yZWNtX2g1lgl1bmRlZmluZWSmDjE0NC41Mi4xNTEuMTUxvMYA1gDs8A8E
         * provider : 2
         * v_attr : {"source":"egame_obs","hv_direction":1,"v_cache_tm_max":0,"v_cache_tm_min":0,"dual_id":198,"dual_type":2,"v_play_mode":0,"v_width":0,"v_height":0}
         * channel_id :
         * play_url : http://3954.liveplay.myqcloud.com/live/3954_497383565_1200.flv?bizid=3954&txSecret=a11f6abfbc52a72594012b175862eb3e&txTime=5eabe32e&fromdj=&_qedj_t=Bhi6I%2FN43L5MsXmUW%2Bh3H5WmIl97sDYJm8IQASYUNDk3MzgzNTY1XzE1ODc3MTgzMTgyXqLtskxWHE9nSXpDcUVTQUFBWjlIcVhDYVFGQUVadHlRQmhmAHAChjFwZ2dfbGl2ZV9yZWFkX2lmY19tdF9zdnIuZ2V0X2xpdmVfbGlzdF9ieV9yZWNtX2g1lgl1bmRlZmluZWSmDjE0NC41Mi4xNTEuMTUxvMYA1gDs8A8E
         * url_high_reslution : http://shp.qpic.cn/pggamehead/0/1583760042_910_750x400/0
         * h265_url : http://flv265-3954.liveplay.myqcloud.com/live/3954_497383565_1200.flv?bizid=3954&txSecret=a11f6abfbc52a72594012b175862eb3e&txTime=5eabe32e&fromdj=&_qedj_t=BhjqahXyFCGPWUtU5fut%2B2CfOKrumSZs48cQASYUNDk3MzgzNTY1XzE1ODc3MTgzMTgyXqLtskxWHE9nSXpDcUVTQUFDcDlIcVhDYVFGQUVodHlRQmhmAHAChjFwZ2dfbGl2ZV9yZWFkX2lmY19tdF9zdnIuZ2V0X2xpdmVfbGlzdF9ieV9yZWNtX2g1lgl1bmRlZmluZWSmDjE0NC41Mi4xNTEuMTUxvMYA1gDs8A8E
         * player_type : 2
         * h265_decode_type : 0
         * url_low_resolution :
         * bg_color_pc :
         * bitrate : 0
         * desc :
         */

        private String vid;
        private int video_type;
        private String url;
        private String dst;
        private int provider;
        private VAttrBean v_attr;
        private String channel_id;
        private String play_url;
        private String url_high_reslution;
        private String h265_url;
        private int player_type;
        private int h265_decode_type;
        private String url_low_resolution;
        private String bg_color_pc;
        private int bitrate;
        private String desc;

        public String getVid() {
            return vid;
        }

        public void setVid(String vid) {
            this.vid = vid;
        }

        public int getVideo_type() {
            return video_type;
        }

        public void setVideo_type(int video_type) {
            this.video_type = video_type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDst() {
            return dst;
        }

        public void setDst(String dst) {
            this.dst = dst;
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

        public String getChannel_id() {
            return channel_id;
        }

        public void setChannel_id(String channel_id) {
            this.channel_id = channel_id;
        }

        public String getPlay_url() {
            return play_url;
        }

        public void setPlay_url(String play_url) {
            this.play_url = play_url;
        }

        public String getUrl_high_reslution() {
            return url_high_reslution;
        }

        public void setUrl_high_reslution(String url_high_reslution) {
            this.url_high_reslution = url_high_reslution;
        }

        public String getH265_url() {
            return h265_url;
        }

        public void setH265_url(String h265_url) {
            this.h265_url = h265_url;
        }

        public int getPlayer_type() {
            return player_type;
        }

        public void setPlayer_type(int player_type) {
            this.player_type = player_type;
        }

        public int getH265_decode_type() {
            return h265_decode_type;
        }

        public void setH265_decode_type(int h265_decode_type) {
            this.h265_decode_type = h265_decode_type;
        }

        public String getUrl_low_resolution() {
            return url_low_resolution;
        }

        public void setUrl_low_resolution(String url_low_resolution) {
            this.url_low_resolution = url_low_resolution;
        }

        public String getBg_color_pc() {
            return bg_color_pc;
        }

        public void setBg_color_pc(String bg_color_pc) {
            this.bg_color_pc = bg_color_pc;
        }

        public int getBitrate() {
            return bitrate;
        }

        public void setBitrate(int bitrate) {
            this.bitrate = bitrate;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public static class VAttrBean {
            /**
             * source : egame_obs
             * hv_direction : 1
             * v_cache_tm_max : 0
             * v_cache_tm_min : 0
             * dual_id : 198
             * dual_type : 2
             * v_play_mode : 0
             * v_width : 0
             * v_height : 0
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
    }

    public static class ExtBean {
    }

    public static class UserPrivBean {
        /**
         * priv_base : {"level":0,"level_pic":""}
         * used_medals : []
         * noble_info : {"level":0,"u_sh":""}
         * priv_base_new : {"level":0,"level_pic":""}
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
             * level : 0
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
             * level : 0
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

    public static class ReportInfoBean {
        /**
         * strategy_id : 0
         * algo_source : 1
         * algo_id : 0
         * resource_id : 0
         * algo_info :
         */

        private int strategy_id;
        private int algo_source;
        private int algo_id;
        private int resource_id;
        private String algo_info;

        public int getStrategy_id() {
            return strategy_id;
        }

        public void setStrategy_id(int strategy_id) {
            this.strategy_id = strategy_id;
        }

        public int getAlgo_source() {
            return algo_source;
        }

        public void setAlgo_source(int algo_source) {
            this.algo_source = algo_source;
        }

        public int getAlgo_id() {
            return algo_id;
        }

        public void setAlgo_id(int algo_id) {
            this.algo_id = algo_id;
        }

        public int getResource_id() {
            return resource_id;
        }

        public void setResource_id(int resource_id) {
            this.resource_id = resource_id;
        }

        public String getAlgo_info() {
            return algo_info;
        }

        public void setAlgo_info(String algo_info) {
            this.algo_info = algo_info;
        }
    }

    public static class ProgramResBean {
        /**
         * right_tag : {"name":"专区小时榜NO.2","style_type":700,"priority":10005200}
         * left_tag : {"name":"","style_type":0,"priority":0}
         * cover_url : http://shp.qpic.cn/pggamehead/0/1583760042_910_750x400/374
         * icon_tag : {"url":"","position":0,"priority":0,"style_type":0}
         * cover_frame : {"url_16_9":"","url_1_1":""}
         * right_user_tag : {"name":"","style_type":0}
         * cover : {"cover_url":"","square_cover_url":""}
         */

        private RightTagBean right_tag;
        private LeftTagBean left_tag;
        private String cover_url;
        private IconTagBean icon_tag;
        private CoverFrameBean cover_frame;
        private RightUserTagBean right_user_tag;
        private CoverBean cover;

        public RightTagBean getRight_tag() {
            return right_tag;
        }

        public void setRight_tag(RightTagBean right_tag) {
            this.right_tag = right_tag;
        }

        public LeftTagBean getLeft_tag() {
            return left_tag;
        }

        public void setLeft_tag(LeftTagBean left_tag) {
            this.left_tag = left_tag;
        }

        public String getCover_url() {
            return cover_url;
        }

        public void setCover_url(String cover_url) {
            this.cover_url = cover_url;
        }

        public IconTagBean getIcon_tag() {
            return icon_tag;
        }

        public void setIcon_tag(IconTagBean icon_tag) {
            this.icon_tag = icon_tag;
        }

        public CoverFrameBean getCover_frame() {
            return cover_frame;
        }

        public void setCover_frame(CoverFrameBean cover_frame) {
            this.cover_frame = cover_frame;
        }

        public RightUserTagBean getRight_user_tag() {
            return right_user_tag;
        }

        public void setRight_user_tag(RightUserTagBean right_user_tag) {
            this.right_user_tag = right_user_tag;
        }

        public CoverBean getCover() {
            return cover;
        }

        public void setCover(CoverBean cover) {
            this.cover = cover;
        }

        public static class RightTagBean {
            /**
             * name : 专区小时榜NO.2
             * style_type : 700
             * priority : 10005200
             */

            private String name;
            private int style_type;
            private int priority;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getStyle_type() {
                return style_type;
            }

            public void setStyle_type(int style_type) {
                this.style_type = style_type;
            }

            public int getPriority() {
                return priority;
            }

            public void setPriority(int priority) {
                this.priority = priority;
            }
        }

        public static class LeftTagBean {
            /**
             * name :
             * style_type : 0
             * priority : 0
             */

            private String name;
            private int style_type;
            private int priority;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getStyle_type() {
                return style_type;
            }

            public void setStyle_type(int style_type) {
                this.style_type = style_type;
            }

            public int getPriority() {
                return priority;
            }

            public void setPriority(int priority) {
                this.priority = priority;
            }
        }

        public static class IconTagBean {
            /**
             * url :
             * position : 0
             * priority : 0
             * style_type : 0
             */

            private String url;
            private int position;
            private int priority;
            private int style_type;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getPosition() {
                return position;
            }

            public void setPosition(int position) {
                this.position = position;
            }

            public int getPriority() {
                return priority;
            }

            public void setPriority(int priority) {
                this.priority = priority;
            }

            public int getStyle_type() {
                return style_type;
            }

            public void setStyle_type(int style_type) {
                this.style_type = style_type;
            }
        }

        public static class CoverFrameBean {
            /**
             * url_16_9 :
             * url_1_1 :
             */

            private String url_16_9;
            private String url_1_1;

            public String getUrl_16_9() {
                return url_16_9;
            }

            public void setUrl_16_9(String url_16_9) {
                this.url_16_9 = url_16_9;
            }

            public String getUrl_1_1() {
                return url_1_1;
            }

            public void setUrl_1_1(String url_1_1) {
                this.url_1_1 = url_1_1;
            }
        }

        public static class RightUserTagBean {
            /**
             * name :
             * style_type : 0
             */

            private String name;
            private int style_type;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getStyle_type() {
                return style_type;
            }

            public void setStyle_type(int style_type) {
                this.style_type = style_type;
            }
        }

        public static class CoverBean {
            /**
             * cover_url :
             * square_cover_url :
             */

            private String cover_url;
            private String square_cover_url;

            public String getCover_url() {
                return cover_url;
            }

            public void setCover_url(String cover_url) {
                this.cover_url = cover_url;
            }

            public String getSquare_cover_url() {
                return square_cover_url;
            }

            public void setSquare_cover_url(String square_cover_url) {
                this.square_cover_url = square_cover_url;
            }
        }
    }

    public static class PkInfoBean {
        /**
         * guest_anchor_id : 0
         * guest_cover_url :
         * guest_pk_level :
         * guest_face_url :
         */

        private int guest_anchor_id;
        private String guest_cover_url;
        private String guest_pk_level;
        private String guest_face_url;

        public int getGuest_anchor_id() {
            return guest_anchor_id;
        }

        public void setGuest_anchor_id(int guest_anchor_id) {
            this.guest_anchor_id = guest_anchor_id;
        }

        public String getGuest_cover_url() {
            return guest_cover_url;
        }

        public void setGuest_cover_url(String guest_cover_url) {
            this.guest_cover_url = guest_cover_url;
        }

        public String getGuest_pk_level() {
            return guest_pk_level;
        }

        public void setGuest_pk_level(String guest_pk_level) {
            this.guest_pk_level = guest_pk_level;
        }

        public String getGuest_face_url() {
            return guest_face_url;
        }

        public void setGuest_face_url(String guest_face_url) {
            this.guest_face_url = guest_face_url;
        }
    }

    public static class LbsInfoBean {
        /**
         * lbs_desc :
         * ad_code : 0
         */

        private String lbs_desc;
        private int ad_code;

        public String getLbs_desc() {
            return lbs_desc;
        }

        public void setLbs_desc(String lbs_desc) {
            this.lbs_desc = lbs_desc;
        }

        public int getAd_code() {
            return ad_code;
        }

        public void setAd_code(int ad_code) {
            this.ad_code = ad_code;
        }
    }

    public static class JumpBean {
        /**
         * room_style : 1
         * show_time_info : {"type":0,"data":""}
         * json_ext :
         * ext : {"is_pay":"0"}
         */

        private int room_style;
        private ShowTimeInfoBean show_time_info;
        private String json_ext;
        private ExtBeanX ext;

        public int getRoom_style() {
            return room_style;
        }

        public void setRoom_style(int room_style) {
            this.room_style = room_style;
        }

        public ShowTimeInfoBean getShow_time_info() {
            return show_time_info;
        }

        public void setShow_time_info(ShowTimeInfoBean show_time_info) {
            this.show_time_info = show_time_info;
        }

        public String getJson_ext() {
            return json_ext;
        }

        public void setJson_ext(String json_ext) {
            this.json_ext = json_ext;
        }

        public ExtBeanX getExt() {
            return ext;
        }

        public void setExt(ExtBeanX ext) {
            this.ext = ext;
        }

        public static class ShowTimeInfoBean {
            /**
             * type : 0
             * data :
             */

            private int type;
            private String data;

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getData() {
                return data;
            }

            public void setData(String data) {
                this.data = data;
            }
        }

        public static class ExtBeanX {
            /**
             * is_pay : 0
             */

            private String is_pay;

            public String getIs_pay() {
                return is_pay;
            }

            public void setIs_pay(String is_pay) {
                this.is_pay = is_pay;
            }
        }
    }
}
