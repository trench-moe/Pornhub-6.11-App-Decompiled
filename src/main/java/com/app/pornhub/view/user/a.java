package com.app.pornhub.view.user;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class a extends BaseAdapter {

    /* renamed from: c  reason: collision with root package name */
    public b f5521c;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<UserMetaData> f5522f = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public TreeSet<Integer> f5523j = new TreeSet<>();

    /* renamed from: m  reason: collision with root package name */
    public SparseArray<String> f5524m = new SparseArray<>();
    public String n = BuildConfig.FLAVOR;

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public UserMetaData f5525c;

        public c(UserMetaData userMetaData, C0062a c0062a) {
            this.f5525c = userMetaData;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b bVar = a.this.f5521c;
            UserFriendsFragment userFriendsFragment = (UserFriendsFragment) bVar;
            userFriendsFragment.I0(ProfileActivity.C(userFriendsFragment.q(), this.f5525c));
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public LinearLayout f5527a;

        /* renamed from: b  reason: collision with root package name */
        public ImageView f5528b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f5529c;

        public d() {
        }

        public d(C0062a c0062a) {
        }
    }

    public a(b bVar) {
        this.f5521c = bVar;
    }

    public int a() {
        return this.f5522f.size() - this.f5523j.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f5522f.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f5522f.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i10) {
        return this.f5523j.contains(Integer.valueOf(i10)) ? 1 : 0;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        d dVar;
        boolean contains = this.f5523j.contains(Integer.valueOf(i10));
        if (view == null) {
            dVar = new d(null);
            if (!contains) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_friendlist_row, viewGroup, false);
                dVar.f5527a = (LinearLayout) view.findViewById(R.id.fragment_friendlist_row_lly);
                dVar.f5528b = (ImageView) view.findViewById(R.id.fragment_friendlist_row_imgUser);
                dVar.f5529c = (TextView) view.findViewById(R.id.fragment_friendlist_row_txtUser);
            } else if (contains) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_friendlist_separator, viewGroup, false);
                dVar.f5529c = (TextView) view.findViewById(R.id.fragment_friendlist_separator_txtTitle);
            }
            view.setTag(dVar);
        } else {
            dVar = (d) view.getTag();
        }
        if (contains) {
            dVar.f5529c.setText(this.f5524m.get(i10));
        } else {
            UserMetaData userMetaData = this.f5522f.get(i10);
            dVar.f5529c.setText(userMetaData.getUsername());
            dVar.f5527a.setOnClickListener(new c(userMetaData, null));
            com.bumptech.glide.b.e(dVar.f5528b).o(userMetaData.getUrlThumbnail()).j(R.drawable.thumb_preview).i(m9.a.p(50), m9.a.p(50)).A(dVar.f5528b);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        return !this.f5523j.contains(Integer.valueOf(i10));
    }
}
