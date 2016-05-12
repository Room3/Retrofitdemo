package com.lpp.demo.redemo.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhuzi on 16/5/3.
 */
public class Article implements Serializable {

    /**
     * postid : PHOTI6H8000300AJ
     * hasCover : false
     * hasHead : 1
     * replyCount : 2415
     * hasImg : 1
     * digest :
     * hasIcon : true
     * docid : 9IG74V5H00963VRO_BM56R1SAbjsongyuxinupdateDoc
     * title : 文章马伊琍寺庙烧香 女儿拜佛有模有样
     * order : 1
     * priority : 250
     * lmodify : 2016-05-03 13:46:32
     * boardid : ent2_bbs
     * ads : [{"title":"权志龙现北京车展引粉丝尖叫","tag":"photoset","imgsrc":"http://img4.cache.netease.com/3g/2016/4/26/2016042610475973707.jpg","subtitle":"","url":"00AJ0003|595787"}]
     * photosetID : 00AJ0003|596520
     * template : manual
     * votecount : 2281
     * skipID : 00AJ0003|596520
     * alias : Entertainment
     * skipType : photoset
     * cid : C1348648351901
     * hasAD : 1
     * imgextra : [{"imgsrc":"http://img6.cache.netease.com/3g/2016/5/3/201605031349224d804.jpg"},{"imgsrc":"http://img6.cache.netease.com/3g/2016/5/3/2016050313493231ae4.jpg"}]
     * source : 网易娱乐
     * ename : yule
     * tname : 娱乐
     * imgsrc : http://img6.cache.netease.com/3g/2016/5/3/20160503140523826fb.jpg
     * ptime : 2016-05-03 13:46:32
     */

    private List<T1348648517839Entity> T1348648517839;

    public void setT1348648517839(List<T1348648517839Entity> T1348648517839) {
        this.T1348648517839 = T1348648517839;
    }

    public List<T1348648517839Entity> getT1348648517839() {
        return T1348648517839;
    }

    public static class T1348648517839Entity {
        private String postid;
        private boolean hasCover;
        private int hasHead;
        private int replyCount;
        private int hasImg;
        private String digest;
        private boolean hasIcon;
        private String docid;
        private String title;
        private int order;
        private int priority;
        private String lmodify;
        private String boardid;
        private String photosetID;
        private String template;
        private int votecount;
        private String skipID;
        private String alias;
        private String skipType;
        private String cid;
        private int hasAD;
        private String source;
        private String ename;
        private String tname;
        private String imgsrc;
        private String ptime;
        /**
         * title : 权志龙现北京车展引粉丝尖叫
         * tag : photoset
         * imgsrc : http://img4.cache.netease.com/3g/2016/4/26/2016042610475973707.jpg
         * subtitle :
         * url : 00AJ0003|595787
         */

        private List<AdsEntity> ads;
        /**
         * imgsrc : http://img6.cache.netease.com/3g/2016/5/3/201605031349224d804.jpg
         */

        private List<ImgextraEntity> imgextra;

        public void setPostid(String postid) {
            this.postid = postid;
        }

        public void setHasCover(boolean hasCover) {
            this.hasCover = hasCover;
        }

        public void setHasHead(int hasHead) {
            this.hasHead = hasHead;
        }

        public void setReplyCount(int replyCount) {
            this.replyCount = replyCount;
        }

        public void setHasImg(int hasImg) {
            this.hasImg = hasImg;
        }

        public void setDigest(String digest) {
            this.digest = digest;
        }

        public void setHasIcon(boolean hasIcon) {
            this.hasIcon = hasIcon;
        }

        public void setDocid(String docid) {
            this.docid = docid;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public void setLmodify(String lmodify) {
            this.lmodify = lmodify;
        }

        public void setBoardid(String boardid) {
            this.boardid = boardid;
        }

        public void setPhotosetID(String photosetID) {
            this.photosetID = photosetID;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public void setVotecount(int votecount) {
            this.votecount = votecount;
        }

        public void setSkipID(String skipID) {
            this.skipID = skipID;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public void setSkipType(String skipType) {
            this.skipType = skipType;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public void setHasAD(int hasAD) {
            this.hasAD = hasAD;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public void setTname(String tname) {
            this.tname = tname;
        }

        public void setImgsrc(String imgsrc) {
            this.imgsrc = imgsrc;
        }

        public void setPtime(String ptime) {
            this.ptime = ptime;
        }

        public void setAds(List<AdsEntity> ads) {
            this.ads = ads;
        }

        public void setImgextra(List<ImgextraEntity> imgextra) {
            this.imgextra = imgextra;
        }

        public String getPostid() {
            return postid;
        }

        public boolean isHasCover() {
            return hasCover;
        }

        public int getHasHead() {
            return hasHead;
        }

        public int getReplyCount() {
            return replyCount;
        }

        public int getHasImg() {
            return hasImg;
        }

        public String getDigest() {
            return digest;
        }

        public boolean isHasIcon() {
            return hasIcon;
        }

        public String getDocid() {
            return docid;
        }

        public String getTitle() {
            return title;
        }

        public int getOrder() {
            return order;
        }

        public int getPriority() {
            return priority;
        }

        public String getLmodify() {
            return lmodify;
        }

        public String getBoardid() {
            return boardid;
        }

        public String getPhotosetID() {
            return photosetID;
        }

        public String getTemplate() {
            return template;
        }

        public int getVotecount() {
            return votecount;
        }

        public String getSkipID() {
            return skipID;
        }

        public String getAlias() {
            return alias;
        }

        public String getSkipType() {
            return skipType;
        }

        public String getCid() {
            return cid;
        }

        public int getHasAD() {
            return hasAD;
        }

        public String getSource() {
            return source;
        }

        public String getEname() {
            return ename;
        }

        public String getTname() {
            return tname;
        }

        public String getImgsrc() {
            return imgsrc;
        }

        public String getPtime() {
            return ptime;
        }

        public List<AdsEntity> getAds() {
            return ads;
        }

        public List<ImgextraEntity> getImgextra() {
            return imgextra;
        }

        public static class AdsEntity {
            private String title;
            private String tag;
            private String imgsrc;
            private String subtitle;
            private String url;

            public void setTitle(String title) {
                this.title = title;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public void setImgsrc(String imgsrc) {
                this.imgsrc = imgsrc;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getTitle() {
                return title;
            }

            public String getTag() {
                return tag;
            }

            public String getImgsrc() {
                return imgsrc;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public String getUrl() {
                return url;
            }
        }

        public static class ImgextraEntity {
            private String imgsrc;

            public void setImgsrc(String imgsrc) {
                this.imgsrc = imgsrc;
            }

            public String getImgsrc() {
                return imgsrc;
            }
        }
    }
}
