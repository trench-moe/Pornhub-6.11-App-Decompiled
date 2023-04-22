package u4;

import androidx.recyclerview.widget.n;
import com.app.pornhub.domain.model.video.VideoMetaData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends n.e<VideoMetaData> {
    @Override // androidx.recyclerview.widget.n.e
    public boolean a(VideoMetaData videoMetaData, VideoMetaData videoMetaData2) {
        VideoMetaData oldItem = videoMetaData;
        VideoMetaData newItem = videoMetaData2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return true;
    }

    @Override // androidx.recyclerview.widget.n.e
    public boolean b(VideoMetaData videoMetaData, VideoMetaData videoMetaData2) {
        VideoMetaData oldItem = videoMetaData;
        VideoMetaData newItem = videoMetaData2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.getVkey(), newItem.getVkey());
    }
}
