package com.vogonjeltz.archie.runtime

import com.vogonjeltz.archie.runtime.types.ArchieInstance

/**
  * Created by Freddie on 05/03/2017.
  */
class ReturnException(val value: Option[ArchieInstance]) extends Exception{

}
