package io.vigg

package object rtb {

  case class Source(
      fd: Integer,
      tid: Integer,
      pchain: String
  )

  case class Regs(
      coppa: Integer,
      ext: Any
  )

  case class Imp(
      id: String,
      metric: Array[Metric],
      banner: Banner,
      video: Video,
      audio: Audio,
      native: Native,
      pmp: Pmp,
      displaymanager: String,
      displaymanagerver: String,
      isntl: Int,
      tagid: String,
      bidfloor: Double,
      bidflootcur: String,
      clickbrowser: Integer,
      secure: Integer,
      iframebuster: Array[String],
      exp: Integer,
      ext: Any
  )

  case class Metric(
      typ: String,
      value: Double,
      vendor: String,
      ext: Any
  )

  case class Banner(
      format: Array[Format],
      w: Int,
      h: Int,
      wmanx: Int,
      hmax: Int,
      wmin: Int,
      hmin: Int,
      btype: Array[Int],
      battr: Array[Int],
      pos: Int,
      mimes: Array[String],
      topframe: Int,
      expdir: Array[Int],
      api: Array[Int],
      id: String,
      vcm: Int,
      ext: Any
  )

  case class Video(
      mimes: Array[String],
      minduration: Int,
      maxduration: Int,
      protocols: Array[Int],
      protocol: Int,
      w: Int,
      h: Int,
      startdelay: Int,
      placement: Int,
      linearity: Int,
      skip: Int,
      skipmin: Int,
      skipafter: Int,
      sequence: Int,
      battr: Array[Int],
      maxextended: Int,
      minbitrate: Int,
      maxbitrate: Int,
      boxingaloowed: Int,
      playbackmethod: Array[Int],
      playbackend: Int,
      delivery: Array[Int],
      pos: Int,
      companionad: Array[Banner],
      api: Array[Int],
      ext: Any
  )

  case class Audio(
      mimes: Array[String],
      minduration: Int,
      maxduration: Int,
      protocols: Array[Int],
      startdelay: Int,
      sequence: Int,
      battr: Array[Int],
      maxextended: Int,
      minbitrate: Int,
      maxbitrate: Int,
      delivery: Array[Int],
      companionad: Array[Banner],
      api: Int,
      companiontype: Array[Int],
      maxseq: Int,
      feed: Int,
      stitched: Int,
      nvol: Int,
      ext: Any
  )

  case class Native(
      request: String,
      ver: String,
      api: Array[Int],
      battr: Array[Int],
      ext: Any
  )

  case class Format(
      w: Int,
      h: Int,
      wratio: Int,
      hratio: Int,
      wmin: Int,
      ext: Any
  )

  case class Pmp(
      private_auction: Int,
      deals: Array[Deal],
      ext: Any
  )

  case class Deal(
      id: String,
      bidfloor: Double,
      bidfloorcur: String,
      at: Int,
      wseat: Array[String],
      wadomain: Array[String],
      ext: Any
  )

  case class Site(
      id: String,
      name: String,
      domain: String,
      cat: String,
      sectioncat: Array[String],
      pagecat: Array[String],
      page: String,
      ref: String,
      search: String,
      mobile: Int,
      privacypolicy: Int,
      publisher: Publisher,
      content: Content,
      keywords: String,
      ext: Any
  )

  case class App(
      id: String,
      name: String,
      bundle: String,
      domain: String,
      storeurl: String,
      cat: Array[String],
      sectioncat: Array[String],
      pagecat: Array[String],
      ver: String,
      privacypolicy: Int,
      paid: Int,
      publisher: Publisher,
      content: Content,
      keywords: String,
      ext: Any
  )

  case class Publisher(
      id: String,
      name: String,
      cat: Array[String],
      domain: String,
      ext: Any
  )

  case class Content(
      id: String,
      episode: Int,
      title: String,
      series: String,
      season: String,
      artist: String,
      genre: String,
      album: String,
      isrc: String,
      producer: Producer,
      url: String,
      cat: Array[String],
      prodq: Int,
      videoquality: Int,
      context: Int,
      contentration: String,
      userrating: String,
      qagmediarating: Int,
      keywords: String,
      livestream: Int,
      sourcerelationship: Int,
      len: Int,
      language: String,
      embeddable: Int,
      data: Array[Data],
      ext: Any
  )

  case class Producer(
      id: String,
      name: String,
      cat: Array[String],
      domain: String,
      ext: Any
  )

  case class Device(
      ua: String,
      geo: Geo,
      dnt: Int,
      lmt: Int,
      ip: String,
      ipv6: String,
      devicetype: Int,
      make: String,
      model: String,
      os: String,
      osv: String,
      hwv: String,
      h: Int,
      w: Int,
      ppi: Int,
      pxratio: Double,
      js: Int,
      geofetch: Int,
      flashver: String,
      language: String
  )

  case class Geo(
      lat: Double,
      lon: Double,
      typ: Int,
      accuracy: Int,
      lastfix: Int,
      ipservice: Int,
      country: String,
      region: String,
      regionfips104: String,
      metro: String,
      city: String,
      zip: String,
      utcoffset: Int,
      ext: Any
  )

  case class User(
      id: String,
      buyeruid: String,
      yob: Int,
      gender: String,
      keywords: String,
      customdata: String,
      geo: Geo,
      data: Array[Data],
      ext: Any
  )

  case class Data(
      id: String,
      name: String,
      segment: Array[Segment],
      ext: Any
  )

  case class Segment(
      id: String,
      name: String,
      value: String,
      ext: Any
  )

  case class BidRequest(
      id: String,
      imp: Array[Imp],
      site: Site,
      app: App,
      device: Device,
      user: User,
      test: Int,
      at: Int,
      tmax: Int,
      wseat: Array[String],
      bseat: Array[String],
      allimps: Integer,
      cur: Array[String],
      wlang: Array[String],
      bcat: Array[String],
      badv: Array[String],
      bapp: Array[String],
      source: Source,
      ext: Any
  )

  case class Bid(
      id: String,
      impid: String,
      price: Double,
      nurl: String,
      burl: String,
      lurl: String,
      adm: String,
      adid: String,
      adomain: Array[String],
      bundle: String,
      iurl: String,
      cid: String,
      crid: String,
      tactic: String,
      cat: Array[String],
      attr: Array[Int],
      api: Int,
      protocol: Int,
      qagmediarating: Int,
      language: String,
      dealid: String,
      w: Int,
      h: Int,
      wratio: Int,
      hratio: Int,
      exp: Int,
      ext: Any
  )

  case class SeatBid(
      bid: Array[Bid],
      seat: String,
      group: Int,
      ext: Any
  )

  case class BidResponse(
      id: String,
      seatbid: Array[SeatBid],
      bidid: String,
      cur: String,
      customdata: String,
      nbr: Int,
      ext: Any
  )

}
