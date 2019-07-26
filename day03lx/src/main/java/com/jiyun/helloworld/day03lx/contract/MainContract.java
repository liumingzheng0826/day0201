package com.jiyun.helloworld.day03lx.contract;

import com.jiyun.helloworld.day03lx.bean.ListData;

import java.util.List;

/**
 * Created by ASAS on 2019/7/26.
 */

public interface MainContract {
    interface MainView{
        void showSuccess(List<ListData> data);

        void showErrow(String error);
    }

    interface MainPresenter{
        void http();
    }

    interface MainModle{
        interface CallBack{
            void showSuccess(List<ListData> data);

            void showError(String error);
        }
        void getData(CallBack callBack);
    }
}
