package com.example.testdemo;


import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MyTwoAdapter extends BaseQuickAdapter<TextBean, BaseViewHolder> {
    HashMap<Integer,String> map=new HashMap<>();
    public MyTwoAdapter(int layoutResId) {
        super(layoutResId);
    }


    @Override
    protected void convert(BaseViewHolder helper, TextBean item) {
        //helper.setText(R.id.editText,"烦烦烦");
        ((EditText)helper.getView(R.id.editText)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
             if (!TextUtils.isEmpty(s.toString())){
                 getData().get(helper.getAdapterPosition()).setInputText(s.toString());
                 getData().get(helper.getAdapterPosition()).setPosition(helper.getAdapterPosition());
                 //map.put(helper.getAdapterPosition(),s.toString());
             }
            }
        });
        try {
            if (item.getPosition()==helper.getAdapterPosition()&&!TextUtils.isEmpty(item.getInputText())){
                helper.setText(R.id.editText,item.getInputText());

            }else {
                helper.setText(R.id.editText,"");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
       /* try {
            if (TextUtils.isEmpty(map.get(helper.getAdapterPosition()))){
                helper.setText(R.id.editText,"");
            }else {
                helper.setText(R.id.editText,map.get(helper.getAdapterPosition()));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
*/

    }

}
