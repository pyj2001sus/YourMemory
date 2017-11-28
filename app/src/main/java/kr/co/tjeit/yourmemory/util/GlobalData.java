package kr.co.tjeit.yourmemory.util;


import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.yourmemory.adapter.NewsfeedAdapter;
import kr.co.tjeit.yourmemory.data.NewsData;
import kr.co.tjeit.yourmemory.data.NoticeData;


/**
 * Created by the on 2017-09-05.
 */

public class GlobalData {

    public static List<NewsData> newsfeed = new ArrayList<>();
    public static List<NoticeData> notice = new ArrayList<>();

    public static void initGlobalData() {
        newsfeed.clear();
        notice.clear();

        newsfeed.add(new NewsData(1, "박영주", "https://lh3.googleusercontent.com/B4Rmc8NPG7fHIGmN65214ppzNGHNa_wuLSSJ6Dz85KJoZ0zlBFnpH16pOJBHpwA0fCs=w300",
                15, "반갑습니다", "나는 행복합니다~ 나는 행복합니다~ 나는 행복합니다~ 이글스라 행복합니다~",
                "http://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Eagles_in_concert_September_2014.jpg/1280px-Eagles_in_concert_September_2014.jpg",
                2, 3, 1, 3));
        newsfeed.add(new NewsData(1, "박영주", "https://lh3.googleusercontent.com/B4Rmc8NPG7fHIGmN65214ppzNGHNa_wuLSSJ6Dz85KJoZ0zlBFnpH16pOJBHpwA0fCs=w300",
                15, "안녕하세요", "나는 행복합니다~ 나는 행복합니다~ 나는 행복합니다~ 이글스라 행복합니다~",
                "http://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Eagles_in_concert_September_2014.jpg/1280px-Eagles_in_concert_September_2014.jpg",
                12, 5, 66, 41));
        newsfeed.add(new NewsData(1, "박영주", "https://lh3.googleusercontent.com/B4Rmc8NPG7fHIGmN65214ppzNGHNa_wuLSSJ6Dz85KJoZ0zlBFnpH16pOJBHpwA0fCs=w300",
                15, "고생하세요", "나는 행복합니다~ 나는 행복합니다~ 나는 행복합니다~ 이글스라 행복합니다~",
                "http://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Eagles_in_concert_September_2014.jpg/1280px-Eagles_in_concert_September_2014.jpg",
                11, 5, 32, 123));
        newsfeed.add(new NewsData(1, "박영주", "https://lh3.googleusercontent.com/B4Rmc8NPG7fHIGmN65214ppzNGHNa_wuLSSJ6Dz85KJoZ0zlBFnpH16pOJBHpwA0fCs=w300",
                15, "힘이듭니다", "나는 행복합니다~ 나는 행복합니다~ 나는 행복합니다~ 이글스라 행복합니다~",
                "http://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Eagles_in_concert_September_2014.jpg/1280px-Eagles_in_concert_September_2014.jpg",
                13, 56, 79, 2));

        notice.add(new NoticeData(1, "", 4, "", "댓글"));
        notice.add(new NoticeData(7, "", 2, "", "좋아요"));
        notice.add(new NoticeData(4, "", 3, "", "대댓글"));
        notice.add(new NoticeData(5, "", 4, "", "좋아요"));
        notice.add(new NoticeData(2, "", 6, "", "댓글"));
        notice.add(new NoticeData(3, "", 8, "", "싫어요"));


    }
}
