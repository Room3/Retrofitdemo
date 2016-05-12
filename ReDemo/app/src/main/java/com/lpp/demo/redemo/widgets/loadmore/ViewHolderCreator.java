package com.lpp.demo.redemo.widgets.loadmore;

/**
 * A interface that defines what a View Holder Creator should do.
 *
 * @param <ItemDataType> the generic type of the data in each item of a list.
 * @author http://www.liaohuqiu.net
 */
public interface ViewHolderCreator<ItemDataType> {
    public ViewHolderBase<ItemDataType> createViewHolder(int position);
}