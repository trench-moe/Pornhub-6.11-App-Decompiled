precision highp float;

uniform mat4 mvpMat;

attribute vec2 vPos;
attribute vec2 vTex;

varying vec2 tex;

void main(void) {
    vec4 pos = vec4(vPos, 0.0, 1.0);
    gl_Position = mvpMat * pos;
    tex = vTex;
}
