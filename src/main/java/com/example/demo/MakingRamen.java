package com.example.demo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class MakingRamen {
    public final void boiling(){
        System.out.println(" HTTP 유저로부터 요청을 받아서 HTTP 정보를 담는 객체를 만든다");
        System.out.println(" 어떤 API 호출인지 검색한다 " + this.water());
        System.out.println(" 검색된 여러분들이 개발했던 API 하나를 골라서 실행한다 " + this.soup());
        System.out.println(" API 결과를 HTTP 반환하기 위한 데이터로 변환을 한다 " + this.noodle());
        System.out.println(" 페이지가 필요하다면 페이지를 서버에서 렌더링한다 ");
    }
    protected abstract String water();
    protected abstract String soup();
    protected abstract String noodle();
}
