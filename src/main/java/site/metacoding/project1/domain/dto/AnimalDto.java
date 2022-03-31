package site.metacoding.project1.domain.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AnimalDto {

    private Response response;

    @AllArgsConstructor
    @Data
    class Response {
        private Header header;
        private Body body;

        @AllArgsConstructor
        @Data
        class Header {
            private Integer reqNo;
            private Integer resultCode;
            private String resultMsg;
        }

        @AllArgsConstructor
        @Data
        class Body {
            private Items Items;
            private Integer nomOfRows;
            private Integer pageNo;
            private Integer totalCount;

            @AllArgsConstructor
            @Data
            class Items {
                private List<Item> item;

                @AllArgsConstructor
                @Data
                class Item {
                    private Long desertionNo;
                    private String filename;
                    private Integer happenDt;
                    private String happenPlace;
                    private String kindCd;
                    private String colorCd;
                    private String age;
                    private String weight;
                    private String noticeNo;
                    private String noticeSdt;
                    private String noticeEdt;
                    private String popfile;
                    private String processState;
                    private String sexCd;
                    private String neuterYn;
                    private String specialMark;
                    private String careNm;
                    private String careTel;
                    private String careAddr;
                    private String orgNm;
                    private String chargeNm;
                    private String officetel;
                }
            }
        }
    }
}
