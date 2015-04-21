package com.aspsine.zhihu.daily.respository.interfaces;

import com.aspsine.zhihu.daily.model.DailyStories;
import com.aspsine.zhihu.daily.model.StartImage;
import com.aspsine.zhihu.daily.model.Story;
import com.aspsine.zhihu.daily.model.Theme;
import com.aspsine.zhihu.daily.model.Themes;
import com.nostra13.universalimageloader.core.DisplayImageOptions;

/**
 * Created by Aspsine on 2015/4/10.
 */
public interface CacheRepository {
    void getStartImage(int width, int height, Callback<StartImage> callback);

    void saveStartImage(int width, int height, DisplayImageOptions options, StartImage startImage);

    void getLatestDailyStories(Callback<DailyStories> callback);

    void getBeforeDailyStories(String date, Callback<DailyStories> callback);

    void getStoryDetail(String storyId, Callback<Story> callback);

    void getThemes(Callback<Themes> callback);

    void getTheme(String themeId, Callback<Theme> callback);

    void getThemeBeforeStory(String themeId, String storyId, Callback<Theme> callback);

    public interface Callback<T> {

        /**
         * Successful
         *
         * @param t
         */
        public void success(T t);


        /**
         * Unsuccessful
         *
         * @param e unexpected exception.
         */
        public void failure(Exception e);
    }
}
