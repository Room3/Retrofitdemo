package com.lpp.demo.redemo.adapter;

import android.widget.BaseAdapter;

import com.daimajia.swipe.SwipeLayout;
import com.daimajia.swipe.implments.SwipeItemAdapterMangerImpl;
import com.daimajia.swipe.interfaces.SwipeAdapterInterface;
import com.daimajia.swipe.interfaces.SwipeItemMangerInterface;
import com.daimajia.swipe.util.Attributes;

import java.util.List;

/**
 * Created by xuyanjun on 15/12/12.
 */
public abstract class BaseSwipeAdapter extends BaseAdapter implements SwipeAdapterInterface, SwipeItemMangerInterface {

    protected SwipeItemAdapterMangerImpl mItemManger = new SwipeItemAdapterMangerImpl(this);

    public void openItem(int position) {
        this.mItemManger.openItem(position);
    }

    public void closeItem(int position) {
        this.mItemManger.closeItem(position);
    }

    public void closeAllExcept(SwipeLayout layout) {
        this.mItemManger.closeAllExcept(layout);
    }

    public void closeAllItems() {
        this.mItemManger.closeAllItems();
    }

    public List<Integer> getOpenItems() {
        return this.mItemManger.getOpenItems();
    }

    public List<SwipeLayout> getOpenLayouts() {
        return this.mItemManger.getOpenLayouts();
    }

    public void removeShownLayouts(SwipeLayout layout) {
        this.mItemManger.removeShownLayouts(layout);
    }

    public boolean isOpen(int position) {
        return this.mItemManger.isOpen(position);
    }

    public Attributes.Mode getMode() {
        return this.mItemManger.getMode();
    }

    public void setMode(Attributes.Mode mode) {
        this.mItemManger.setMode(mode);
    }

    public abstract int getSwipeLayoutResourceId(int i);

}
