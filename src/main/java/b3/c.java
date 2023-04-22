package b3;

import com.app.pornhub.domain.model.channel.ChannelContainer;
import com.app.pornhub.domain.model.channel.ChannelListContainer;
import io.reactivex.Single;

/* loaded from: classes.dex */
public interface c {
    Single<ChannelContainer> a(String str, int i10, int i11, String str2);

    Single<ChannelListContainer> b(int i10, int i11, String str);
}
