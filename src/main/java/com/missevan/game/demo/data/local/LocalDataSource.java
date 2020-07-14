package com.missevan.game.demo.data.local;

import android.support.annotation.NonNull;

import com.missevan.game.demo.data.DataSource;
import com.missevan.game.demo.model.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangya on 2019-10-23.
 */
public class LocalDataSource implements DataSource {
    @Override
    public void getPosts(@NonNull GetPostsCallback getPostsCallback) {
        List<Post> result = new ArrayList<>();
        result.add(new Post("线上", "https://game.missevan.com/", "", 1));
        result.add(new Post("UAT", "https://game.uat.missevan.com/", "", 2));
        result.add(new Post("自定义", "url 需满足如下格式 (http://xx.xx.xx/)", "", 3));
        getPostsCallback.onPostsLoaded(result);
    }

    @Override
    public void getPostImage(@NonNull String url, @NonNull GetImageCallback getImageCallback) {

    }
}
