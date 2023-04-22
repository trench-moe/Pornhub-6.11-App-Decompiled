package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentFriendlistBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4580a;

    public FragmentFriendlistBinding(LinearLayout linearLayout, IncludeStatusBinding includeStatusBinding, ListView listView, TextView textView, TextView textView2, TextView textView3) {
        this.f4580a = linearLayout;
    }

    public static FragmentFriendlistBinding bind(View view) {
        int i10 = R.id.fragment_friendlist_includeStatus;
        View t2 = b.t(view, R.id.fragment_friendlist_includeStatus);
        if (t2 != null) {
            IncludeStatusBinding bind = IncludeStatusBinding.bind(t2);
            i10 = R.id.fragment_friendlist_lvFriends;
            ListView listView = (ListView) b.t(view, R.id.fragment_friendlist_lvFriends);
            if (listView != null) {
                i10 = R.id.fragment_user_friendlist_tab_txtFriends;
                TextView textView = (TextView) b.t(view, R.id.fragment_user_friendlist_tab_txtFriends);
                if (textView != null) {
                    i10 = R.id.fragment_user_friendlist_tab_txtSubscribers;
                    TextView textView2 = (TextView) b.t(view, R.id.fragment_user_friendlist_tab_txtSubscribers);
                    if (textView2 != null) {
                        i10 = R.id.fragment_user_friendlist_tab_txtSubscriptions;
                        TextView textView3 = (TextView) b.t(view, R.id.fragment_user_friendlist_tab_txtSubscriptions);
                        if (textView3 != null) {
                            return new FragmentFriendlistBinding((LinearLayout) view, bind, listView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentFriendlistBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_friendlist, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4580a;
    }
}
