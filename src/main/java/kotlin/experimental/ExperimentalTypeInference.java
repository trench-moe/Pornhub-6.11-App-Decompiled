package kotlin.experimental;

import com.appsflyer.oaid.BuildConfig;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Experimental;
import kotlin.Metadata;
import kotlin.RequiresOptIn;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;

@Target({ElementType.ANNOTATION_TYPE})
@SinceKotlin(version = "1.3")
@RequiresOptIn(level = RequiresOptIn.Level.ERROR)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lkotlin/experimental/ExperimentalTypeInference;", BuildConfig.FLAVOR, "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
@Experimental(level = Experimental.Level.ERROR)
@Documented
/* loaded from: classes3.dex */
public @interface ExperimentalTypeInference {
}
