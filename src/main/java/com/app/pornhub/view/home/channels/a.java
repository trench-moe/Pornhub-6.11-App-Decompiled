package com.app.pornhub.view.home.channels;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ItemChannelBinding;
import com.app.pornhub.domain.model.channel.ChannelMetaData;
import com.app.pornhub.view.channeldetails.ChannelActivity;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a extends c4.a<ChannelMetaData> {

    /* renamed from: e  reason: collision with root package name */
    public b f5129e;

    /* renamed from: f  reason: collision with root package name */
    public View.OnClickListener f5130f;

    /* renamed from: com.app.pornhub.view.home.channels.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0054a implements View.OnClickListener {
        public View$OnClickListenerC0054a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChannelsFragment channelsFragment = (ChannelsFragment) a.this.f5129e;
            channelsFragment.I0(ChannelActivity.C(channelsFragment.q(), (String) view.getTag()));
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final ItemChannelBinding f5132u;

        public c(ItemChannelBinding itemChannelBinding) {
            super(itemChannelBinding.f4707a);
            this.f5132u = itemChannelBinding;
        }
    }

    public a(b bVar) {
        super(new ArrayList());
        this.f5130f = new View$OnClickListenerC0054a();
        this.f5129e = bVar;
    }

    @Override // c4.a
    public void n(RecyclerView.z zVar, int i10) {
        c cVar = (c) zVar;
        ChannelMetaData channelMetaData = (ChannelMetaData) this.d.get(i10);
        View.OnClickListener onClickListener = this.f5130f;
        com.bumptech.glide.b.e(cVar.f5132u.f4709c).o(channelMetaData.getCover()).j(R.drawable.placeholder_channel_banner).A(cVar.f5132u.f4709c);
        com.bumptech.glide.b.e(cVar.f5132u.f4708b).o(channelMetaData.getAvatar()).j(R.drawable.placeholder_channel_avatar).A(cVar.f5132u.f4708b);
        cVar.f5132u.f4710e.setVisibility(channelMetaData.isPremium() ? 0 : 8);
        cVar.f5132u.d.setText(channelMetaData.getTitle());
        cVar.f5132u.f4712g.setText(channelMetaData.getSubscribersCount());
        cVar.f5132u.f4714i.setText(channelMetaData.getVideosCount());
        cVar.f5132u.f4713h.setText(channelMetaData.getVideoViewsCount());
        cVar.f5132u.f4711f.setText(channelMetaData.getRank());
        cVar.f5132u.f4707a.setTag(channelMetaData.getId());
        cVar.f5132u.f4707a.setOnClickListener(onClickListener);
    }

    @Override // c4.a
    public RecyclerView.z o(ViewGroup viewGroup, int i10) {
        return new c(ItemChannelBinding.bind(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_channel, viewGroup, false)));
    }
}
