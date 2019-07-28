package util;


import VO.ResultVO;
import enmu.ErrorEnum;

public class ResultVOUtil {
    public static ResultVO success(Object data){
        ResultVO resultVO=new ResultVO();
        resultVO.setData(data);
        resultVO.setCode(Constants.SUCCESS_CODE);
        resultVO.setMsg(Constants.SUCCESS_MSG);
        return resultVO;
    }

    public static ResultVO success(){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(Constants.SUCCESS_CODE);
        resultVO.setMsg(Constants.SUCCESS_MSG);
        return resultVO;
    }

    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
    public static ResultVO error(ErrorEnum errorEnum){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(errorEnum.getCode());
        resultVO.setMsg(errorEnum.getMsg());
        return resultVO;
    }
}
