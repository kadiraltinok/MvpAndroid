
package com.msevgi.mvpandroid.Login;

public interface LoginInteractor {
    public void login(String username, String password, OnLoginFinishedListener listener);
}
