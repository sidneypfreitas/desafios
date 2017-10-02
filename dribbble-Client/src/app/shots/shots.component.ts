import { Component, OnInit } from '@angular/core';
import { ShotsService} from '../shots.service'

@Component({
  selector: 'app-shots',
  templateUrl: './shots.component.html',
  styleUrls: ['./shots.component.css'],
  providers: [ShotsService]
})
export class ShotsComponent implements OnInit {

    shots: Array<any>;

    constructor(private shotsService: ShotsService) { }

    ngOnInit() {
        this.shotsService.getAll().subscribe(
            data => {
                this.shots = data;
            },
            error => console.error(error)
        )
    }
}
