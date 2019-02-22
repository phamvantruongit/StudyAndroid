package vn.com.it.truongpham.study_android.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import vn.com.it.truongpham.study_android.BR;
import vn.com.it.truongpham.study_android.Object;
import vn.com.it.truongpham.study_android.R;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.CustomViewHolder> {

    private List<Object> usersList;

    public ExampleAdapter(List<Object> userList) {
        this.usersList = userList;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewDataBinding viewDataBinding= DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),R.layout.item,viewGroup,false);

        return new CustomViewHolder(viewDataBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, final int i) {
        ViewDataBinding viewDataBinding= customViewHolder.getViewDataBinding();
        viewDataBinding.setVariable(BR.object, usersList.get(i));

        customViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding mViewDataBinding;

        public CustomViewHolder(@NonNull ViewDataBinding itemView) {
            super(itemView.getRoot());
            mViewDataBinding = itemView;
            mViewDataBinding.executePendingBindings();
        }

        public ViewDataBinding getViewDataBinding() {
            return mViewDataBinding;
        }


    }
}
