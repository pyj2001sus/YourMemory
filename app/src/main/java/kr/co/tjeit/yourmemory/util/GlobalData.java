package kr.co.tjeit.yourmemory.util;


import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.yourmemory.adapter.NewsfeedAdapter;
import kr.co.tjeit.yourmemory.data.NewsData;


/**
 * Created by the on 2017-09-05.
 */

public class GlobalData {

    public static List<NewsData> newsfeed= new ArrayList<>();

    public static void initGlobalData() {
        newsfeed.clear();

        newsfeed.add(new NewsData(1, "박영주", "asdf", 15, "내가 니 엄마다", "나는 행복합니다~ 나는 행복합니다~ 나는 행복합니다~ 이글스라 행복합니다~",
                "http://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Eagles_in_concert_September_2014.jpg/1280px-Eagles_in_concert_September_2014.jpg",
                2, 3, 1, 3));
        newsfeed.add(new NewsData(1, "박영주", "asdf", 15, "내가 니 엄마다", "나는 행복합니다~ 나는 행복합니다~ 나는 행복합니다~ 이글스라 행복합니다~",
                "http://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Eagles_in_concert_September_2014.jpg/1280px-Eagles_in_concert_September_2014.jpg",
                2, 3, 1, 3));
        newsfeed.add(new NewsData(1, "박영주", "asdf", 15, "내가 니 엄마다", "나는 행복합니다~ 나는 행복합니다~ 나는 행복합니다~ 이글스라 행복합니다~",
                "http://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Eagles_in_concert_September_2014.jpg/1280px-Eagles_in_concert_September_2014.jpg",
                2, 3, 1, 3));
        newsfeed.add(new NewsData(1, "박영주", "asdf", 15, "내가 니 엄마다", "나는 행복합니다~ 나는 행복합니다~ 나는 행복합니다~ 이글스라 행복합니다~",
                "http://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Eagles_in_concert_September_2014.jpg/1280px-Eagles_in_concert_September_2014.jpg",
                2, 3, 1, 3));



    }
}
