package w;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

@SuppressLint({"LogConditional"})
/* loaded from: classes2.dex */
public class a {
    public static String a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder m10 = a1.a.m(".(");
        m10.append(stackTraceElement.getFileName());
        m10.append(":");
        m10.append(stackTraceElement.getLineNumber());
        m10.append(") ");
        m10.append(stackTraceElement.getMethodName());
        m10.append("()");
        return m10.toString();
    }

    public static String b() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder m10 = a1.a.m(".(");
        m10.append(stackTraceElement.getFileName());
        m10.append(":");
        m10.append(stackTraceElement.getLineNumber());
        m10.append(")");
        return m10.toString();
    }

    public static String c(Context context, int i10) {
        if (i10 != -1) {
            try {
                return context.getResources().getResourceEntryName(i10);
            } catch (Exception unused) {
                return a1.a.j("?", i10);
            }
        }
        return "UNKNOWN";
    }

    public static String d(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String e(MotionLayout motionLayout, int i10) {
        return i10 == -1 ? "UNDEFINED" : motionLayout.getContext().getResources().getResourceEntryName(i10);
    }
}
