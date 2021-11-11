package com.example.cse416_server_jax.Objects;

public class DistrictPlan {
    private boolean isEnacted;

    public DistrictPlan(boolean isEnacted) {
        this.isEnacted = isEnacted;
    }

    public boolean isEnacted() {
        return isEnacted;
    }

    public void setEnacted(boolean enacted) {
        isEnacted = enacted;
    }
}
