package t3;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.app.pornhub.domain.model.video.Video;
import com.app.pornhub.domain.model.video.VideoContentType;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.view.videodetails.LockedPayVideoActivity;
import com.app.pornhub.view.videodetails.LockedVideoActivity;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import java.io.IOException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class p {
    public static boolean a(VideoMetaData videoMetaData) {
        return (videoMetaData.isLocked() || TextUtils.isEmpty(videoMetaData.getPreviewUrl())) ? false : true;
    }

    public static String b(Video video) {
        return video.getEncodings().isFullHd() ? video.getEncodings().getUrl1080p() : video.getVideoMetaData().isHd() ? video.getEncodings().getUrl720p() : video.getEncodings().getUrl480p();
    }

    public static Intent c(Context context, VideoMetaData videoMetaData, boolean z10) {
        return (videoMetaData.getVideoContentType() != VideoContentType.PREMIUM || z10) ? (!videoMetaData.isPaid() || videoMetaData.isAvailable()) ? VideoDetailsActivity.G(context, videoMetaData.getVkey()) : LockedPayVideoActivity.D(context, videoMetaData) : LockedVideoActivity.C(context, videoMetaData);
    }

    public static Video d(com.squareup.moshi.k kVar, JSONObject jSONObject) {
        try {
            return (Video) kVar.a(Video.class).fromJson(jSONObject.toString());
        } catch (IOException unused) {
            throw new RuntimeException("Malformed video json data.");
        }
    }
}
